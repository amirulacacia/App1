package lesson.lesson10.drawingprogram;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AppereancePanel extends JPanel {

    JButton colorButton = new JButton("Choose Color");
    JButton thicknessButton = new JButton("Choose Thickness");
    JButton undoButton = new JButton("Undo");
    JButton redoButton = new JButton("Redo");

    public AppereancePanel() {
        JLabel appereanceLabel = new JLabel("Option: ");

        colorButton = new JButton("Choose Color");
        thicknessButton = new JButton("Choose Thickness");
        undoButton = new JButton("Undo");
        redoButton = new JButton("Redo");

        add(appereanceLabel);
        add(colorButton);
        add(thicknessButton);
        add(undoButton);
        add(redoButton);
    }
}
