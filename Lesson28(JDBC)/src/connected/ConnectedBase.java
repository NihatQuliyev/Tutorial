package connected;
import model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.time.LocalDate;
public class ConnectedBase {
    public static Connection connection(String urlBase, String usernameBase, String passwordBase) throws Exception{
        Class.forName("org.postgresql.Driver");
        String username = usernameBase;
        String password = passwordBase;
        Connection connection = DriverManager.getConnection(urlBase,username,password);
        return connection;
    }

    public static void statement(String ad) throws Exception{
        try (PreparedStatement statement = connection(
                "jdbc:postgresql://localhost:5432/div_academy_3"
                ,"postgres",
                "nihat5775").prepareStatement("SELECT * FROM student WHERE name =?")
        )

        {
            System.out.print("find by name: ");
            statement.setString(1,ad);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String major = resultSet.getString("major");
                int fee = resultSet.getInt("fee");
                LocalDate startDate = resultSet.getDate("start_date").toLocalDate();
                int studentRowInfoId = resultSet.getInt("student_row_info_id");
                Student student = new Student(id,name,surname,major,fee,startDate,studentRowInfoId);
                System.out.println(student);
            }
        }catch (SQLDataException e){
            e.getStackTrace();
        }
    }
}
