package lesson.lesson10.drawingprogram;

import java.awt.Color;
import java.awt.Shape;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseRetriever {
    
    public List<Shape> retrieveShapesFromDatabase() {
        List<Shape> retrievedShapes = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection()) {
            String selectQuery = "SELECT shape_type, start_x, start_y, end_x, end_y, thickness, freeform_points FROM shapes";
            try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String shapeType = resultSet.getString("shape_type");
                        double startX = resultSet.getDouble("start_x");
                        double startY = resultSet.getDouble("start_y");
                        double endX = resultSet.getDouble("end_x");
                        double endY = resultSet.getDouble("end_y");
                        String serializedPoints = resultSet.getString("freeform_points");

                        // Create the shape based on retrieved data
                        Shape retrievedShape = createShapeFromData(shapeType, startX, startY, endX, endY, serializedPoints);
                        retrievedShapes.add(retrievedShape);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retrievedShapes;
    }

    public List<Color> retrieveColorFromDatabase() {
        List<Color> retrievedColors = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection()) {
            String selectQuery = "SELECT color_red, color_green, color_blue FROM shapes";
            try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        int red = resultSet.getInt("color_red");
                        int green = resultSet.getInt("color_green");
                        int blue = resultSet.getInt("color_blue");

                        // Create the shape based on retrieved data
                        Color retrievedColor = new Color(red, green, blue);
                        retrievedColors.add(retrievedColor);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return retrievedColors;
    }

    public List<Integer> retrieveThicknessFromDatabase() {
        List<Integer> retrievedThicknesses = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection()) {
            String selectQuery = "SELECT thickness FROM shapes";
            try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        int thickness = resultSet.getInt("thickness");

                        // Create the shape based on retrieved data
                        Integer retrieveThickness = thickness;
                        retrievedThicknesses.add(retrieveThickness);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return retrievedThicknesses;
    }

    private Shape createShapeFromData(String shapeType, double startX, double startY, double endX, double endY,
            String serializedPoints) {

        switch (shapeType) {
            case "FreeForm":
                FreeForm freeForm = new FreeForm();
                freeForm.deserializePoints(serializedPoints);
                return freeForm.draw();
            case "Line":
                Line line = new Line();
                line.startPoint.setLocation(startX, startY);
                line.endPoint.setLocation(endX, endY);
                return line.draw();
            case "Rectangle":
                Rectangle rectangle = new Rectangle();
                rectangle.startPoint.setLocation(startX, startY);
                rectangle.endPoint.setLocation(endX, endY);
                return rectangle.draw();
            case "Circle":
                Circle circle = new Circle();
                circle.startPoint.setLocation(startX, startY);
                circle.endPoint.setLocation(endX, endY);
                return circle.draw();
            default:
                return null;
        }
    }
}
