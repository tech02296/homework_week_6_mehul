package JavaProgramme;

public class Programme03 {
    int a = 100;//Instance Vairable
    static int b = 100;//static variable

    //Instance Method
    public void m1() {
        Programme03 t1 = new Programme03();
        System.out.println("Instance Method");
        System.out.println(t1.b);
        System.out.println(a);
    }
    //Static Method
    public static void addition() {
        System.out.println("Static Method");
        Programme03 t1 = new Programme03();
        System.out.println("Instance Method");
        System.out.println(t1.a);
        System.out.println(b);
    }
    //Calling Istance and static Method in Main Method
    public static void main(String[] args) {
        Programme03 t1 = new Programme03();
        t1.m1();
        addition();

    }

}



