import java.sql.*;

public class Main {

    public Connection getConnection() {
        Connection connection = null;

        try {
            String url = "jdbc:mysql://localhost/test";
            String user= "root";
            String passwd= "";
            connection = DriverManager.getConnection(url,user,passwd);

            if (connection != null) {
                System.out.println("conexión exitosa");
            }
        }catch (SQLException e){
            System.out.println(e);
        }

        return connection;
    }

}