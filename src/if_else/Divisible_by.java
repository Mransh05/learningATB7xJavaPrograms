package if_else;

import java.util.Scanner;

public class Divisible_by {
    public static void main(String[] args) {
        int num;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number : ");
        num = number.nextInt();
        if (num % 5==0 && num%11 ==0)
        {
            System.out.println("This Number is Divisible by 5 and 11");

        }
        else
        {
            System.out.println("This Number is not Divisible by 5 and 11");
        }
    }
}
