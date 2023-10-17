package JavaProgramme;


import java.util.Scanner;

public class Programme13 {
    //three numbers as input to calculate and
    //print the average of the numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int number = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Please enter thired number");
        int number3 = scanner.nextInt();
        avg(number, number2, number3);
        scanner.close();
    }

    public static void avg(int a, int b, int c) {
        int x = (a + b + c) / 3;
        System.out.println(x);

    }
}
