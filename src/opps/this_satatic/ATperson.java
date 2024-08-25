package opps.this_satatic;

public class ATperson {
    String name;
    long number;

    ATperson() {
        System.out.println("Object is created ! ");
    }

    ATperson(String nameGiven) {

        this.name = nameGiven;

    }

    ATperson(String nameGiven, long phonenumber) {

        this.name = nameGiven;
        this.number = phonenumber;

    }
}
