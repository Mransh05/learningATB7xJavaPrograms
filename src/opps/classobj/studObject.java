package opps.classobj;

public class studObject {
    public static void main(String[] args) {
        Student std = new Student();
        std.name="amit";
        std.rolln =1;
        System.out.println("First student Name is "+std.name);
        System.out.println("First student roll number "+std.rolln);

        Student std1 = new Student();
        std1.name="Jay";
        std1.rolln =2;
        std1.talk();
        std1.sleep();
        System.out.println("Second student Name is"+std1.name);
        System.out.println("Second student roll number "+std1.rolln);

    }
}
