package lesson.lesson10.drawingprogram;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawingProgramApp extends JFrame {
    // Initialize currentShape of drawing. Making FREEFORM as default.
    private ShapeType currentShape = ShapeType.FREEFORM;
    private Point startPoint;
    private DrawingPanel drawingPanel;

    public DrawingProgramApp() {
        setTitle("Drawing Program"); // Set the title of app
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800); // Set size of windows
        setLocationRelativeTo(null);

        // Panel for shape button
        JPanel buttonPanel = new JPanel();

        // Label for shape button
        JLabel buttonLabel = new JLabel("Shape: ");

        // Shape Button
        JButton lineButton = new JButton("Line");
        JButton rectangleButton = new JButton("Rectangle");
        JButton circleButton = new JButton("Circle");
        JButton freeformButton = new JButton("Freeform");

        // NEW CODE //
        JButton colorButton = new JButton("Choose Color");
        JButton thicknessButton = new JButton("Choose Thickness");
        JButton undoButton = new JButton("Undo");
        JButton redoButton = new JButton("Redo");
        // END OF NEW CODE //

        // Panel for drawing
        drawingPanel = new DrawingPanel();

        // Button Action Listener
        lineButton.addActionListener(e -> currentShape = ShapeType.LINE);
        rectangleButton.addActionListener(e -> currentShape = ShapeType.RECTANGLE);
        circleButton.addActionListener(e -> currentShape = ShapeType.CIRCLE);
        freeformButton.addActionListener(e -> currentShape = ShapeType.FREEFORM);

        // NEW CODE //
        JPanel customPanel = new JPanel();
        JLabel customLabel = new JLabel("Option: ");
        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colorButton.setBackground(drawingPanel.chooseColor(colorButton.getBackground()));
            }
        });

        thicknessButton.addActionListener(e -> drawingPanel.chooseThickness());
        undoButton.addActionListener(e -> drawingPanel.undo());
        redoButton.addActionListener(e -> drawingPanel.redo());
        // END OF NEW CODE //

        // Mouse Listener
        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startPoint = e.getPoint(); // Taking the value of first point
                if (currentShape == ShapeType.FREEFORM) {
                    drawingPanel.startFreeformDrawing(startPoint); // Send the value of first point to the method
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (currentShape == ShapeType.FREEFORM) {
                    drawingPanel.stopFreeformDrawing(); // Call method to stop Freefor Drawing
                } else {
                    drawingPanel.drawShape(startPoint, e.getPoint(), currentShape); // Send the value of first point,
                                                                                    // last point and shape type to
                                                                                    // method
                    drawingPanel.repaint(); // a method of Component class which will call paintComponent(Graphics g)
                }
            }
        });

        drawingPanel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (currentShape == ShapeType.FREEFORM) {
                    drawingPanel.continueFreeformDrawing(e.getPoint()); // Sending the value of each point mouse move
                }
            }
        });

        // Adding button to panel
        buttonPanel.add(buttonLabel);
        buttonPanel.add(lineButton);
        buttonPanel.add(rectangleButton);
        buttonPanel.add(circleButton);
        buttonPanel.add(freeformButton);

        // NEW CODE //
        customPanel.add(customLabel);
        customPanel.add(colorButton);
        customPanel.add(thicknessButton);
        customPanel.add(undoButton);
        customPanel.add(redoButton);
        // END OF NEW CODE //

        // Adding panel to the program
        setLayout(new FlowLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(drawingPanel, BorderLayout.CENTER);
        add(customPanel, BorderLayout.SOUTH);

    }

}
