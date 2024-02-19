package lesson.lesson10.drawingprogram;

import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class FreeForm extends DrawingShape {
    protected List<Point2D> freeformPoints;
    protected StringBuilder serializedStringPoints;

    public FreeForm() {
        freeformPoints = new ArrayList<>();
        freeformPoints.clear();
    }

    @Override
    public Shape draw() {
        if (!freeformPoints.isEmpty()) {
            Shape freeformShape = createFreeformShape();
            serializedStringPoints = new StringBuilder(serializePoints());
            freeformPoints.clear();
            return freeformShape;
        } else
            return null;
    }

    private Shape createFreeformShape() {
        GeneralPath path = new GeneralPath();
        path.moveTo(freeformPoints.get(0).getX(), freeformPoints.get(0).getY());
        for (Point2D point : freeformPoints) {
            path.lineTo(point.getX(), point.getY());
        }
        return path;
    }

    public String serializePoints() {
        StringBuilder sb = new StringBuilder();
        for (Point2D point : freeformPoints) {
            sb.append(point.getX()).append(",").append(point.getY()).append(";");
        }
        return sb.toString();
    }

    // Method to recreate list of points from a string
    public void deserializePoints(String serializedPoints) {
        freeformPoints.clear();
        String[] pointTokens = serializedPoints.split(";");
        for (String pointToken : pointTokens) {
            String[] coordinates = pointToken.split(",");
            double x = Double.parseDouble(coordinates[0]);
            double y = Double.parseDouble(coordinates[1]);
            freeformPoints.add(new Point2D.Double(x, y));
        }
    }

}
