package from_negash;

import java.util.Scanner;

public class UsingTheWeekEnum {
    public static void main(String[] args) {
        toDay();
    }

    public static void toDay() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter numbers from 1  to 7 ");
        int num = scan.nextInt();

            if (num > 0 && num <= 7) {

                switch (num) {
                    case 1:
                        System.out.println(DaysOfTheweek.MONDAY);
                        break;
                    case 2:
                        System.out.println(DaysOfTheweek.TUESDAY);
                        break;
                    case 3:
                        System.out.println(DaysOfTheweek.WEDNESDAY);
                        break;
                    case 4:
                        System.out.println(DaysOfTheweek.THURSDAY);
                        break;
                    case 5:
                        System.out.println(DaysOfTheweek.FRIDAY);
                        break;
                    case 6:
                        System.out.println(DaysOfTheweek.SATURDAY);
                        break;
                    case 7:
                        System.out.println(DaysOfTheweek.SUNDAY);
                        break;
                    default:
                        System.out.println("We are out of choice");
                        break;

                }

            } else {
                System.out.println("The number doesn't much with the request ");
                System.out.println("please try again");

            }



    }
}
