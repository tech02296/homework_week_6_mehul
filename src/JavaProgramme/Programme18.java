package JavaProgramme;

import java.util.Scanner;

public class Programme18 {
    // the sum (addition), multiply, subtract, divide and
    //remainder of two numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:  ");
        int firstnumber = scanner.nextInt();
        System.out.println("Input second number: ");
        int secondnumber = scanner.nextInt();

        System.out.println(firstnumber + " + " + secondnumber + " = " + (firstnumber + secondnumber));
        System.out.println(firstnumber + " - " + secondnumber + " = " + (firstnumber - secondnumber));
        System.out.println(firstnumber + " * " + secondnumber + " = " + (firstnumber * secondnumber));
        System.out.println(firstnumber + " / " + secondnumber + " = " + (firstnumber / secondnumber));
        System.out.println(firstnumber + " mod " + secondnumber + " = " + (firstnumber % secondnumber));

    }
}




