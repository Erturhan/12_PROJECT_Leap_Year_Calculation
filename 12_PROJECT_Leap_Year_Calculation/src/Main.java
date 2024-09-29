import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* A leap year is a year with 366 days in the Gregorian calendar instead of 365.
         This extra day (leap day) is obtained by adding February 29 to February,
         which is normally 28 days. */

        int year;

        System.out.print("please enter any year : ");
        year = scan.nextInt();

        if (year % 2 == 0) {
            System.out.println(year + " is leep year .");
        }

        if (year % 2 != 0) {
            System.out.println(year + " isn't leep year .");
        }


    }
}