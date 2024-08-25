package opps.this_satatic;

public class DetailsBank {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        System.out.println("My bank name : " + bank.bankName);
        System.out.println("My bank name : " + bank.balance);
        System.out.println("My bank name : " + bank.bankcode);
        System.out.println("____________ Parameter Constructor ____________________");
        BankAccount hdfc = new BankAccount("HDFc", 1000, "HDFC01");
        System.out.println("My bank name : " + hdfc.bankName);
        System.out.println("My bank name : " + hdfc.balance);
        System.out.println("My bank name : " + hdfc.bankcode);
        System.out.println("____________Below data print using the method____________ ");

        bank.details();
    }
}
