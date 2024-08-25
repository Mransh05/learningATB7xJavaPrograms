package opps.this_satatic;

public class BankAccount {
    String bankName;
    int balance;
    String bankcode;

    BankAccount() {
        bankName = "SBI";
        balance = 100;
        bankcode = "SBI01";

    }

    BankAccount(String bname, int bln, String bncode) {
        this.bankName = bname;
        this.balance = bln;
        this.bankcode = bncode;

    }

    void details() {
        System.out.println("Bnak Name: " + bankName);
        System.out.println("Balance in Bank" + balance);
        System.out.println("Bank Code is : " + bankcode);
    }
}
