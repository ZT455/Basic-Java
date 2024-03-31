import java.util.Scanner;
import java.sql.*;

public class Request {
    public static void request(int month) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;


        try {

            connection = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-DCT1PI8;database=Group;encrypt=false;trustServerCertificate=true", "admin", "Ghbujdjh1");


            statement = connection.createStatement();

            String sqlQuery = "SELECT * FROM Groups WHERE MONTH(Birthday) = " + month;

            resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("Name");
                String surname = resultSet.getString("Surname");
                String patronymic = resultSet.getString("LastName");
                Date birthday = resultSet.getDate("Birthday");
                String gradebook = resultSet.getString("Gradebook");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Surname: " + surname);
                System.out.println("Patronymic: " + patronymic);
                System.out.println("Birthday: " + birthday);
                System.out.println("Gradebook: " + gradebook);
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of month: ");

        int month = scanner.nextInt();

        request(month);

    }
}


