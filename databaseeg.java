

public class databaseeg {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/University";
        String username = "root";
        String password = "Madhu@456";

        Connection connection = null;

        try {
            // Establish a connection
            connection = DriverManager.getConnection(url, username, password);

            // Use the connection (e.g., create a statement, execute queries, etc.)
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM EngineeringStudents");

            while (resultSet.next()) {
                // Process the results
                System.out.println("Column1: " + resultSet.getString("column1"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
