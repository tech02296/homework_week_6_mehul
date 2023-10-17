package JavaProgramme;

import java.util.Scanner;

public class Programme07 {
    //temperature value in degree Fahrenheit and
    //convert to degree Celsius
    public static void tempreatureValue(double fahrenheit) {
        double celsius = ((fahrenheit - 32) * 5 / 9);
        //Formula for conversation
        System.out.println(fahrenheit + " degree fahrenheit is equal to " + celsius + " in celsuis");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a degree in fahrenheit");
        double fahrenheit = input.nextDouble();
        tempreatureValue(fahrenheit);
        input.close();

    }
}















