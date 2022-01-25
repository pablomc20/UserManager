import java.sql.Connection;
import java.sql.SQLException;

public class User {
    public static void main(String[] args) throws SQLException {
        Main conn = new Main();

        try(Connection cnn = conn.getConnection()){

        }catch (Exception e) {
            System.out.println();
        }
    }
}
