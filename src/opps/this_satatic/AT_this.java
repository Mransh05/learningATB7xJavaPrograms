package opps.this_satatic;

public class AT_this {
    public static void main(String[] args) {
        ATperson p1 = new ATperson(" Ansh");
        ATperson p2 = new ATperson(" Singh");
        ATperson p3 = new ATperson(" Ravindra",88888899);

        System.out.println("First name" + p1.name);
        System.out.println("second name" + p2.name);
        System.out.println("Third Name and phone number : " + p3.name+" "+p3.number);
    }
}
