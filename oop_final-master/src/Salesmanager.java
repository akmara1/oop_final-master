import java.sql.*;

public class Salesmanager {
    private static Connection connection;
    public static void allClients() {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "49577982";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT name FROM clients";
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
    public static void search(String name) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "49577982";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            PreparedStatement sql = connection.prepareStatement("select name, address from clients where ? like name");
            sql.setObject(1, name);
            String s = sql.toString();
            ResultSet rs = statement.executeQuery(s);
            while (rs.next()) {
                System.out.printf("%s bought flat in %s",rs.getString("name"), rs.getString("address"));
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void empty() {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "49577982";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT address FROM clients where name like null";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                String str = result.getString("address");
                System.out.println(str);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void sold() {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "49577982";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT address FROM clients where name ilike null";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                String str = result.getString("address");
                System.out.println(str);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void max() {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "49577982";
        try {
            int count = 0;
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT address from clients where price = (select  max(price) from clients);";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                System.out.printf("The most expencive %d", result.getString("name"));
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void min() {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "49577982";
        try {
            int count = 0;
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT address from clients where price = (select  min(price) from clients);";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                System.out.printf("The cheapest %d", result.getString("name"));
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
