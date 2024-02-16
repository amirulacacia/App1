package lesson.lesson9.drawing_program;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DrawingProgramApp app = new DrawingProgramApp();
            app.setVisible(true);
        });
    }
}
