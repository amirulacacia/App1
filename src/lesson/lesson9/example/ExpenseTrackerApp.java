package lesson.lesson9.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ExpenseTrackerApp extends JFrame {
    private JTextField expenseField;
    @SuppressWarnings("rawtypes")
    private JList expensesList;
    @SuppressWarnings("rawtypes")
    private DefaultListModel listModel;

    @SuppressWarnings("unchecked")
    public ExpenseTrackerApp() {
        setTitle("Expense Tracker");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();

        // textField
        JPanel inputJPanel = new JPanel();
        JLabel expenseLabel = new JLabel("Expense: ");
        expenseField = new JTextField(20);

        // button
        listModel = new DefaultListModel<>();
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new AddButtonListener());

        inputJPanel.add(expenseLabel);
        inputJPanel.add(expenseField);
        inputJPanel.add(addButton);

        // scroll list
        expensesList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(expensesList);

        // delete button
        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new DeleteButtonListener());

        panel.add(inputJPanel);
        panel.add(scrollPane);
        panel.add(deleteButton);
        add(panel);
    }

    @SuppressWarnings("unchecked")
    public class AddButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String expense = expenseField.getText().trim();
            if (!expense.isEmpty()) {
                listModel.addElement(expense);
                expenseField.setText("");
            }
        }

    }

    public class DeleteButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int selectIndex = expensesList.getSelectedIndex();
            if (selectIndex != -1) {
                listModel.remove(selectIndex);
            }
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExpenseTrackerApp app = new ExpenseTrackerApp();
            app.setVisible(true);
        });
    }
}
