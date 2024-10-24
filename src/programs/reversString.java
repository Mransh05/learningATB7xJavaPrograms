package programs;

import java.util.Scanner;

public class reversString {
    public static void main(String[] args) {

        Scanner pro = new Scanner(System.in);
        System.out.println("Enter your string ");
        String original = pro.nextLine();
        String revers = " ";
        char ch;
        System.out.println("Original word: " + original);
        for (int i = 0; i < original.length(); i++) {
            ch = original.charAt(i);
            revers = ch + revers;
        }
        System.out.println("Reversed word: " + revers);
    }
}
