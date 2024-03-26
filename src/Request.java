import java.util.Scanner;
import java.sql.*;

public class Request {
    public static void request(int month) {
        // Объекты для установления соединения и выполнения запросов
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;


        try {
            // Установление соединения с базой данных
            connection = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-DCT1PI8;database=Students;encrypt=false;trustServerCertificate=true", "admin", "Ghbujdjh1");

            // Создание объекта для выполнения SQL-запросов
            statement = connection.createStatement();

            // SQL-запрос для выборки данных
            String sqlQuery = "SELECT * FROM listStudents WHERE MONTH(Birthday) = " + month;
            //SELECT * FROM Students WHERE MONTH(Birthday) = ?

            // Выполнение запроса и получение результата
            resultSet = statement.executeQuery(sqlQuery);

            // Обработка результатов запроса
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("Name");
                String surname = resultSet.getString("Surname");
                String patronymic = resultSet.getString("Patronymic");
                Date birthday = resultSet.getDate("Birthday");
                String gradebook = resultSet.getString("Gradebook");

                // Вывод данных
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
            // Закрываем все ресурсы
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
        //Висновок: Формирование запроса на стороне SQL-сервера:
        //При цьомц підході SQL-сервер виконує логіку пошуку та повертає необхідні дані:
        //Переваги
        //1 - Ефективне використання ресурсів: передаються лише необхідні дані
        //2 - Краща продуктивність: SQL-сервери краще оптимізовані для виконання SQL-запитів
        //3 - Зменшена навантаженість на додаток: додаток не виконує важкі обчислення
        //Недоліки:
        //Обмеження SQL: неможливо виконувати складні логічні умови
    }
}


