import java.sql.*;

public class Marketer {
    private  static Connection connection;
    public static void coverage(){
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "password";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM zon WHERE persent != 0";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                String str = result.getString("city");
                Integer str1 = result.getInt("quantity");
                Integer str2 = result.getInt("persent");
                System.out.printf("%s, %s, %s", str, str1, str2);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void socialMedia() {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "password";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM social WHERE social.popul != 0";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                String str = result.getString("name");
                Integer str1 = result.getInt("popul");
                System.out.printf("%s: %d", str, str1);
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
        public static void budjet() {
            String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
            String username = "postgres";
            String password = "password";
            try {
                connection = DriverManager.getConnection(jdbcURL, username, password);
                Statement statement = connection.createStatement();
                String sql = "SELECT * FROM social";
                ResultSet result = statement.executeQuery(sql);
                while (result.next()) {
                    String str = result.getString("name");
                    Integer str1 = result.getInt("budjet");
                    System.out.printf("Budjet for %s : %s", str, str1);
                }
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    public static void holeBudjet() {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "password";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM social";
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()) {
                Integer str = result.getInt("budjet");
                count += str;
            }
            System.out.printf("Hole budjet is %d", count);
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void spend(String name, int sum) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "password";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            PreparedStatement sql = connection.prepareStatement("update social set budjet = social.budjet - ? where name like ?");
            sql.setObject(1, sum);
            sql.setObject(2, name);
            String s = sql.toString();
            statement.executeUpdate(s);
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //director
    public static void totalBudjet(String name) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "password";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM social";
            ResultSet result = statement.executeQuery(sql);
            System.out.println("Budjets: ");
            while (result.next()) {
                if (result.getString("name").equals(name)) {
                    System.out.println(result.getString(("name")));
                }
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void totalSalary() {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "password";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT SUM(salary) FROM worker;";
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                System.out.printf("Total budjet of salary %d", result.getInt("salary"));
            }
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void raiseSalary(String name, int sum) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "password";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            PreparedStatement sql = connection.prepareStatement("update worker set salary = salary + ? where name like ?");
            sql.setObject(1, sum);
            sql.setObject(2, name);

            String s = sql.toString();
            statement.executeUpdate(s);

            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void reduceSalary(String name, int sum) {
        String jdbcURL = "jdbc:postgresql://localhost:5432/ra";
        String username = "postgres";
        String password = "password";
        try {
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();
            PreparedStatement sql = connection.prepareStatement("update worker set salary = salary - ? where name like ?");
            sql.setObject(1, sum);
            sql.setObject(2, name);

            String s = sql.toString();
            statement.executeUpdate(s);

            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
