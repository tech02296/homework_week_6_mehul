package JavaProgramme;

import java.util.Scanner;

public class Programme10 {
    //Multiplication table up to ten
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please number as input and prints its multiplication table up to 10");
        int number = scanner.nextInt();
        multiplication(number);
        scanner.close();

    }

    //    public static void createMultiplicationTable(int number){
//        for (int i = 1; i <11; i++){
//            int multiplication = number *i;
//            System.out.println(number+"*"+ i + "="+ multiplication);
//
//        }
    public static void printMultiplication(int number, int multiplicationNumber) {
        System.out.println(number + "*" + multiplicationNumber + "=" + number * multiplicationNumber);
    }

    public static void multiplication(int number) {
        printMultiplication(number, 1);
        printMultiplication(number, 2);
        printMultiplication(number, 3);
        printMultiplication(number, 4);
        printMultiplication(number, 5);
        printMultiplication(number, 6);
        printMultiplication(number, 7);
        printMultiplication(number, 8);
        printMultiplication(number, 9);
        printMultiplication(number, 10);
    }
}


