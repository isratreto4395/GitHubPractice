package eashasstuff;

import java.sql.*;

public class Config {
   public static String url = "jdbc:mysql://localhost:3306/pnt_selenium?serverTimezone=UTC";
    public static String user = "root";
    public static String password = "password";
   public static Connection connection = null;
    public static Statement statement = null;

    public static Connection connect() throws SQLException {

        connection = DriverManager.getConnection(url, user, password);
        statement = connection.createStatement();
        return connection;

    }

    public static void loginConnection(int emplyID, String passwrd) throws SQLException {
        statement= connect().createStatement();
        ResultSet result;
        String query = "SELECT * FROM employee WHERE  employee_id = '"+emplyID+"'";
        result= statement.executeQuery(query);
        while (result.next()){
            int id = result.getInt("employee_id");
            String passwrd1 = result.getString("password");
            String firstName = result.getString("first_name");
            String lastName = result.getString("last_name");

           // System.out.println(employeId1+"   "+passwrd1);

            if(id == emplyID && passwrd1.equals(passwrd)){
                System.out.println("Successful connection");
                Manager.mainMenu();
            }else{
                System.out.println("Wrong ID/Password, Try Again");
            }
        }


    }


}
