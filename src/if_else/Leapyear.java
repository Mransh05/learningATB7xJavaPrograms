package if_else;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner inputyear = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = inputyear.nextInt();
        boolean isleapyear = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isleapyear = true;
        }
        if (isleapyear) {
            System.out.println(year + "this is leap year");
        } else {
            System.out.println(year + "this is not leap year");
        }

    }
}
