package lesson.lesson10.drawingprogram;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseDeletion {
    public void deleteShapeFromDatabase(int rowIdToDelete) throws SQLException {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String deleteQuery = "DELETE FROM shapes WHERE id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                preparedStatement.setInt(1, rowIdToDelete);
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Row deleted successfully.");
                } else {
                    System.out.println("No rows were deleted.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void alterIdAutoIncremenentDatabase(int databaseSize) throws SQLException{
        try (Connection connection = DatabaseConnection.getConnection()) {
            String deleteQuery = "ALTER TABLE shapes AUTO_INCREMENT = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
                preparedStatement.setInt(1, databaseSize);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
