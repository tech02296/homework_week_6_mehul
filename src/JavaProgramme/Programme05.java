package JavaProgramme;

import java.util.Scanner;

public class Programme05 {
    // instance method for addition
    public void addition(int a, int b) {
        int sum = a+b;
        System.out.println("addition number: " + sum);
    }
    //instance method for substraction

    public void substraction(int a, int b){
        int sub = a-b;
        System.out.println("substration number:" + sub);
    }
    //static mathod for multiplication

    public static void multiplication(int a, int b){
        int mult = a*b;
        System.out.println("multiplication number:" +mult);

    }
    //static method for division

    public static void division(int a, int b){
        int div = a/b;
        System.out.println("division number:" + div);

    }

    public static void main(String[] args) {
        Programme05 p5 = new Programme05();
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number a: ");
        int a = scanner.nextInt();
        System.out.println("please enter number b:");
        int b = scanner.nextInt();
        p5.addition(a,b);
        p5.substraction(a,b);
        multiplication(a,b);
        division(a,b);
        scanner.close();
    }

}
