package programs;

import java.util.Scanner;

public class SwapString {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = str.nextLine();
        System.out.println("Enter second  string: ");
        String str2 = str.nextLine();

        System.out.println("Before swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("After swapping:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);


    }
}

