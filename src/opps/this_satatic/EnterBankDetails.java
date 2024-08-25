package opps.this_satatic;

import java.util.Scanner;

public class EnterBankDetails {
    public static void main(String[] args) {
        Scanner getDetails = new Scanner(System.in);
        System.out.println("Enter Your Bank Name ! ");
        String bname = getDetails.nextLine();
        System.out.println("Enter Your Bank Balance ! ");
        int bnkblc = getDetails.nextInt();
        System.out.println("Enter Your Bank Code ! ");
        String code = getDetails.next();
        BankAccount employeebank = new BankAccount(bname, bnkblc, code);
        employeebank.details();
        getDetails.close();

    }
}
