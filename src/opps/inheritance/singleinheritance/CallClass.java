package opps.inheritance.singleinheritance;

public class CallClass {
    public static void main(String[] args) {
        Son s = new Son();
        s.bhk3();
        s.bhk2();
        Father f = new Father();
        f.bhk2();
        //f.bhk3(); this is not allowed


    }
}
