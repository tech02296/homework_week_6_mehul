package JavaProgramme;

import java.util.Scanner;

public class Programme16 {
    //add two binary numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first binery number: ");
        String b1 = sc.nextLine();
        System.out.println("Please enter second binery number: ");
        String b2 = sc.nextLine();
        sumTwoBineryNumber(b1, b2);
        sc.close();
    }

    public static void sumTwoBineryNumber(String b1, String b2){
        int num1 = Integer.parseInt(b1, 2);
        int num2 = Integer.parseInt(b2, 2);
        int sum = num1 + num2;

        String result = Integer.toBinaryString(sum);
        System.out.println(result);
    }
}
