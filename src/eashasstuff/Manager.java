package eashasstuff;

import java.sql.SQLException;
import java.util.Scanner;

public class Manager {
    static Scanner input = new Scanner(System.in);


    public static void mainMenu() throws SQLException {
        System.out.println("1- Add Employee");
        System.out.println("2- Remove Employee");
        System.out.println("3- Update Employee Profile");
        int selection = input.nextInt();

        switch(selection){
            case 1 :{
                System.out.println("Enter Employee ID : ");
                int employeeId = input.nextInt();
                System.out.println("Enter First Name : ");
                String firstName =input.next();
                System.out.println("Enter Last Name : ");
                String lastName =input.next();
                System.out.println("Enter Password : ");
                String passwrd =input.next();
                System.out.println("Enter Department : ");
                String dept =input.next();
                System.out.println("Enter Salary : ");
                int sal= input.nextInt();
                String quer = "INSERT INTO `employee` (employee_id, password, first_name, last_name, department, salary) VALUES ('" + employeeId + "','" + passwrd + "','" + firstName + "','" + lastName + "','" + dept + "' , '" + sal + "') ";
                Config.connect().createStatement().execute(quer);
                Config.connect().close();
                break;
            }
            case 2 :{
                System.out.println("Enter Employee ID ");
                int employeeId = input.nextInt();
                String quer = "DELETE FROM employee WHERE employee_id = '" + employeeId + "'";
                Config.connect().createStatement().execute(quer);
                System.out.println("Employee is removed from our Database");
                Config.connect().close();
                break;
            }
            case 3 : {
                System.out.println("Update Employee Profile");
                System.out.println("Enter Employee ID: ");
                int employeeId = input.nextInt();

                System.out.println("1- Update First Name : ");
                System.out.println("2- Update Last Name : ");
                System.out.println("3- Update Password : ");
                System.out.println("4- Update Department : ");
                System.out.println("5- Update Salary : ");
                int selection1 = input.nextInt();
                if (selection1 == 1) {
                    System.out.println("Enter First Name : ");
                    String firstName = input.next();
                    String quer = "UPDATE employee SET first_name = '" + firstName + "' WHERE employee_id='" + employeeId + "'";
                    Config.connect().createStatement().execute(quer);
                    System.out.println("Employee is successfully upated");
                    Config.connect().close();
                    break;
                }
                if (selection1 == 2) {
                    System.out.println("Enter Last Name : ");
                    String lastName = input.next();
                    String quer = "UPDATE employee SET last_name = '" + lastName + "' WHERE employee_id='" + employeeId +"'";
                    Config.connect().createStatement().execute(quer);
                    System.out.println("Employee is successfully updated");
                    Config.connect().close();
                    break;

                }
                if (selection1 == 3) {
                    System.out.println("Enter Password : ");
                    String passwrd = input.next();
                    String quer = "UPDATE employee SET password = '" + passwrd + "' WHERE employee_id='" + employeeId + "'";
                    Config.connect().createStatement().execute(quer);
                    System.out.println("Employee is successfully updated");
                    Config.connect().close();
                    break;
                }
                if (selection1 == 4){
                    System.out.println("Enter Department : ");
                    String dept = input.next();
                    String quer = "UPDATE employee SET department = '" + dept + "' WHERE employee_id='" + employeeId + "'";
                    Config.connect().createStatement().execute(quer);
                    System.out.println("Employee is successfully updated");
                    Config.connect().close();
                    break;
                }
                if(selection1 ==5){
                    System.out.println("Enter salary : ");
                    int sal = input.nextInt();
                    String quer = "UPDATE employee SET salary = '" + sal + "' WHERE employee_id='" + employeeId + "'";
                    Config.connect().createStatement().execute(quer);
                    System.out.println("Employee is successfully updated");
                    Config.connect().close();
                    break;
                }

            }
                break;
            }
        }

    }






