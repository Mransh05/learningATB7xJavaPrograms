package if_else;

import java.util.Scanner;

public class negative_positive_zero {
    //check whether a number is negative, positive or zero
    public static void main(String[] args) {

        int num1;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number : ");
        num1 = number.nextInt();
        if (num1 >0 )
        {
            System.out.println("Positive number ");
        }

        else if(num1 <0)
        {
            System.out.println(" Negative number ");
        }
        else {
            System.out.println("number is 0 ");
        }
    }


}
