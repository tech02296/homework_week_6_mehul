package JavaProgramme;

public class Programme01 {
    //InstanceVariable;
    /**
     * Scope - with in the class
     * Memory allocation - when object is created
     * memory - heap
     */
    int a = 20;// a is a Instance variable
    String name = "Tester"; // name is a Instance variable
    //calling instance method in a main method

    public static void main(String[] args) {

        Programme01 obj = new Programme01();
        obj.m1();
        System.out.println(obj.a);
        System.out.println(obj.name);
    }

    // instance method
    public void m1() {
        System.out.println("m1 method");

    }


}
