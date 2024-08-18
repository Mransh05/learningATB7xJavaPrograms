package if_else;

import java.util.Scanner;

public class evenOdd87User {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println("This is even");
        } else {
            System.out.println("This is odd ");
        }
    }
}
