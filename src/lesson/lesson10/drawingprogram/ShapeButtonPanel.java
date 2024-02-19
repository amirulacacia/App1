package lesson.lesson10.drawingprogram;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShapeButtonPanel extends JPanel {
    // Initialize currentShape of drawing. Making FREEFORM as default.
    protected DrawingShape currentShape = new FreeForm();

    public ShapeButtonPanel() {
        // Label for shape button
        JLabel buttonLabel = new JLabel("Shape: ");

        // Shape Button
        JButton lineButton = new JButton("Line");
        JButton rectangleButton = new JButton("Rectangle");
        JButton circleButton = new JButton("Circle");
        JButton freeformButton = new JButton("Freeform");

        // Button Action Listener
        lineButton.addActionListener(e -> currentShape = new Line());
        rectangleButton.addActionListener(e -> currentShape = new Rectangle());
        circleButton.addActionListener(e -> currentShape = new Circle());
        freeformButton.addActionListener(e -> currentShape = new FreeForm());

        // Adding button to panel
        add(buttonLabel);
        add(lineButton);
        add(rectangleButton);
        add(circleButton);
        add(freeformButton);
    }
}
