package JavaProgramme;

public class Programme15 {
    //swap two variable
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println("Please put orignal value of a and b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a ^ b ^ (b = a);
        System.out.println("Please swapped value of a and b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
