package JavaProgramme;

public class Programme04 {
    int a = 100;//Istance Variable
    String name = "Tester";//Istance Variable
    static int b = 100;//Static Variable
    static String alphabetical = "Tester";//Static Variable

        public void m1() {//Istance Method
        Programme04 p4 = new Programme04();
        System.out.println("Print first instance variable: " + a);
        System.out.println("Print second instance variable: " + name);
        System.out.println("Print first static variable:" + p4.b);
        System.out.println("Print second static variable:" + p4.alphabetical);
    }

    public static void m2() {//Static Method
        Programme04 p4 = new Programme04();
        System.out.println("Print first instance variable:" + p4.a);
        System.out.println("Print second instance variable:" + p4.name);
        System.out.println("Print first static variable:" + b);
        System.out.println("Print second static variable:" + alphabetical);
    }
    //Calling
    public static void main(String[] args) {
        Programme04 p4 = new Programme04();
        p4.m1();
        m2();
    }
}



