package JavaProgramme;

public class Programme02 {
    //StaticVariable
    static int a = 10;
    //StaticVariable
    static String name = "Tester";

    //Static method
    public static void addition() {
        System.out.println("static method");
    }
    //Main method
    public void m1() {
        System.out.println("Main method");
    }//Calling static method to main method

    public static void main(String[] args) {
        Programme02 t1 = new Programme02();
        System.out.println(a);
        System.out.println(name);
        addition();
        t1.m1();


    }


}




