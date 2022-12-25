import java.sql.*;

public class Manager {
    private static Connection connection ;
    public static void workersList() {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "49577982";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT name FROM worker";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                String str = result.getString("name");
                System.out.println(str);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void addTask(String name, String task) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "49577982";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "update worker set tasks = concat(tasks,',', ?) where name like ?";
            PreparedStatement sql2 = connection.prepareStatement(sql);
            sql2.setObject(1, task);
            sql2.setObject(2, name);
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

    public static void taskShow(){
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "49577982";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT name,tasks FROM worker";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                String str = result.getString("name");
                String str1 = result.getString("tasks");
                System.out.printf("%s, %s", str, str1);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void coverage(){
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "49577982";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM zon";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                String str = result.getString("city");
                Integer str1 = result.getInt("quantity");
                System.out.printf("%s : %s", str, str1);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
