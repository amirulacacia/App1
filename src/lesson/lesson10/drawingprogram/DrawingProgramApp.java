package lesson.lesson10.drawingprogram;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class DrawingProgramApp extends JFrame {
    private Point startPoint;
    private ShapeButtonPanel shapeButtonPanel;
    private DrawPanel drawingPanel;
    private AppereancePanel appereancePanel;

    public DrawingProgramApp() {
        setTitle("Drawing Program"); // Set the title of app
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800); // Set size of windows
        setLocationRelativeTo(null);

        shapeButtonPanel = new ShapeButtonPanel(); // Panel for shape button
        drawingPanel = new DrawPanel(); // Panel for drawing
        appereancePanel = new AppereancePanel(); // Panel for appereance

        // Button Action Listener
        appereancePanel.colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                appereancePanel.colorButton
                        .setBackground(drawingPanel.chooseColor(appereancePanel.colorButton.getBackground()));
            }
        });
        appereancePanel.thicknessButton.addActionListener(e -> drawingPanel.chooseThickness());
        appereancePanel.undoButton.addActionListener(e -> drawingPanel.undo());
        appereancePanel.redoButton.addActionListener(e -> drawingPanel.redo());

        // Mouse Listener
        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startPoint = e.getPoint(); // Taking the value of first point
                if (shapeButtonPanel.currentShape instanceof FreeForm) {
                    drawingPanel.addPoint(startPoint, shapeButtonPanel.currentShape);// Send the value of first point to
                                                                                     // the method
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (shapeButtonPanel.currentShape instanceof FreeForm)
                    drawingPanel.addPoint(e.getPoint(), shapeButtonPanel.currentShape);
                else
                    drawingPanel.addPoint(startPoint, e.getPoint(), shapeButtonPanel.currentShape);

                drawingPanel.drawShape(shapeButtonPanel.currentShape);
                drawingPanel.repaint(); // a method of Component class which will call paintComponent(Graphics g)
            }
        });

        drawingPanel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (shapeButtonPanel.currentShape instanceof FreeForm) {
                    drawingPanel.addPoint(e.getPoint(), shapeButtonPanel.currentShape); // Sending the value of each
                                                                                        // point mouse move
                }
            }
        });

        // Adding panel to the program
        setLayout(new FlowLayout());
        add(shapeButtonPanel, BorderLayout.NORTH);
        add(drawingPanel, BorderLayout.CENTER);
        add(appereancePanel, BorderLayout.SOUTH);
    }
}
