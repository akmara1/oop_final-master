import java.sql.*;

public class Worker {
    private static Connection connection;
    public static void myTasks(String name){
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "password";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT tasks FROM worker where name like ?";
            PreparedStatement sql2 = connection.prepareStatement(sql);
            sql2.setObject(1, name);
            String s = sql2.toString();
            ResultSet result = statement.executeQuery(s);
            while (result.next()) {
                System.out.println(result.getString("tasks"));
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void finished(String name) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "password";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT finished FROM worker where name like ?";
            PreparedStatement sql2 = connection.prepareStatement(sql);
            sql2.setObject(1, name);
            String s = sql2.toString();
            ResultSet result = statement.executeQuery(s);
            while (result.next()) {
                System.out.println(result.getString("finished"));
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void inProgress(String name) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "password";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT inProgress FROM worker where name like ?";
            PreparedStatement sql2 = connection.prepareStatement(sql);
            sql2.setObject(1, name);
            String s = sql2.toString();
            ResultSet result = statement.executeQuery(s);
            while (result.next()) {
                System.out.println(result.getString("inProgress"));
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void salary(String name) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "password";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT salary FROM worker where name like ?";
            PreparedStatement sql2 = connection.prepareStatement(sql);
            sql2.setObject(1, name);
            String s = sql2.toString();
            ResultSet result = statement.executeQuery(s);
            while (result.next()) {
                System.out.println(result.getString("salary"));
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
