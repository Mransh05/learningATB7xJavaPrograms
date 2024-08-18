package if_else;

import java.util.Scanner;

public class MaxToNumber {
    public static void main(String[] args) {
        int num1,num2;
        Scanner max =new Scanner(System.in);
        System.out.println("Enter number number one : ");
        num1 = max.nextInt();
        System.out.println("Enter number number two : ");
        num2 = max.nextInt();
        if (num1 >  num2)
        {
            System.out.println("Number One is max : "+num1);
        }
        else
        {
            System.out.println("Number Twi is max : "+num2);
        }
    }
}
