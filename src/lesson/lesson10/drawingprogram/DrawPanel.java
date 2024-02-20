package lesson.lesson10.drawingprogram;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    private List<Shape> shapes = new ArrayList<>();
    private List<Color> shapeColors = new ArrayList<>();
    private List<Integer> shapeThicknesses = new ArrayList<>();

    protected Color currentColor = new Color(0, 0, 0);
    private int currentThickness = 2;

    // Initialize an array to store the undo item
    private List<Shape> undoShapes = new ArrayList<>();
    private List<Color> undoColors = new ArrayList<>();
    private List<Integer> undoThickness = new ArrayList<>();

    private DatabaseRetriever retrieveData = new DatabaseRetriever();

    public DrawPanel() {
        setPreferredSize(new Dimension(800, 500));
        setBackground(Color.white);

        shapes.addAll(retrieveData.retrieveShapesFromDatabase());
        shapeColors.addAll(retrieveData.retrieveColorFromDatabase());
        shapeThicknesses.addAll(retrieveData.retrieveThicknessFromDatabase());
        repaint();
    }

    public void drawShape(DrawingShape shapeType) {
        int databaseSize = shapes.size() + undoShapes.size();

        DatabaseDeletion databaseDeletion = new DatabaseDeletion();
        for (int i = databaseSize; i > shapes.size(); i--) {
            try {
                databaseDeletion.deleteShapeFromDatabase(i);
                databaseDeletion.alterIdAutoIncremenentDatabase(i);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        undoShapes.clear();
        undoColors.clear();
        undoThickness.clear();
        
        Shape shape = null;
        shape = shapeType.draw();
        if (shape != null) {
            shapes.add(shape);
            shapeColors.add(currentColor);
            shapeThicknesses.add(currentThickness);

            DatabaseInsertion insertData = new DatabaseInsertion();
            insertData.insertShapeIntoDatabase(shapeType, currentColor, currentThickness);
            repaint();
        }
    }

    public void addPoint(Point currentPoint, DrawingShape shape) {
        if (shape instanceof FreeForm) {
            FreeForm freeForm = (FreeForm) shape;
            freeForm.freeformPoints.add(currentPoint);
        }
    }
    
    public void addPoint(Point startPoint, Point endPoint, DrawingShape shape) {
        shape.startPoint.setLocation(startPoint);
        shape.endPoint.setLocation(endPoint);
    }

    public Color chooseColor(Color backgroundColor) {
        Color newColor = JColorChooser.showDialog(this, "Choose Color", backgroundColor);
        if (newColor != null) {
            currentColor = newColor;
        }
        return newColor;
    }

    public void chooseThickness() {
        String thicknessString = JOptionPane.showInputDialog(this, "Enter line thickness:");
        try {
            int newThickness = Integer.parseInt(thicknessString);
            if (newThickness > 0) {
                currentThickness = newThickness;
            } else {
                JOptionPane.showMessageDialog(this, "Invalid thickness value. Please enter a positive integer.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid integer for thickness.");
        }
    }

    public void undo() {
        if (!shapes.isEmpty()) {
            undoShapes.add(shapes.remove(shapes.size() - 1));
            undoColors.add(shapeColors.remove(shapeColors.size() - 1));
            undoThickness.add(shapeThicknesses.remove(shapeThicknesses.size() - 1));
            repaint();
        }
    }

    public void redo() {
        if (!undoShapes.isEmpty()) {
            shapes.add(undoShapes.remove(undoShapes.size() - 1));
            shapeColors.add(undoColors.remove(undoColors.size() - 1));
            shapeThicknesses.add(undoThickness.remove(undoThickness.size() - 1));
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        List<Shape> allShapes = new ArrayList<>(shapes);

        for (int i = 0; i < allShapes.size(); i++) {
            g.setColor(shapeColors.get(i));
            Graphics2D g2d = (Graphics2D) g;
            g2d.setStroke(new BasicStroke(shapeThicknesses.get(i)));
            g2d.draw(allShapes.get(i));
        }
    }

    public int getShapesSize(){
        return shapes.size();
    }

    public int getUndoShapesSize(){
        return undoShapes.size();
    }
}
