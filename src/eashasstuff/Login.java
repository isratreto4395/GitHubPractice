package eashasstuff;

import java.sql.SQLException;
import java.util.Scanner;

public class Login extends Config{

        static Scanner input = new Scanner(System.in);

        public static void session() throws SQLException {
            System.out.println("Employee ID: ");
            int emplyID = input.nextInt();
            System.out.println("Password: ");
            String passwrd = input.next();

           Config.loginConnection( emplyID, passwrd);
        }



}
