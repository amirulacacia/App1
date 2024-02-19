package lesson.lesson10.drawingprogram;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseInsertion {
    public void insertShapeIntoDatabase(DrawingShape shape, Color color, int thickness) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String insertQuery = "INSERT INTO shapes (shape_type, start_x, start_y, end_x, end_y, color_red, color_green, color_blue, thickness, freeform_points) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                preparedStatement.setString(1, shape.getClass().getSimpleName());
                preparedStatement.setDouble(2, shape.getStartPoint().getX());
                preparedStatement.setDouble(3, shape.getStartPoint().getY());
                preparedStatement.setDouble(4, shape.getEndPoint().getX());
                preparedStatement.setDouble(5, shape.getEndPoint().getY());
                preparedStatement.setInt(6, color.getRed());
                preparedStatement.setInt(7, color.getGreen());
                preparedStatement.setInt(8, color.getBlue());
                preparedStatement.setInt(9, thickness);

                if (shape instanceof FreeForm) {
                    preparedStatement.setString(10, ((FreeForm) shape).serializedStringPoints.toString());
                } else {
                    preparedStatement.setString(10, null);
                }

                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
