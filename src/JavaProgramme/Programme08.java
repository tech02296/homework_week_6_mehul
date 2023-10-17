package JavaProgramme;

import java.util.Scanner;

public class Programme08 {
    //calculate the area of a triangle
    public static void triangle(double a, double b, double c){
        //Formula for area of triangle
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle: "+ area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the side of the triangle a:");
        double a = scanner.nextDouble();
        System.out.println("enter the side of the triangle b:");
        double b = scanner.nextDouble();
        System.out.println("enter the side of the triangle c:");
        double c = scanner.nextDouble();
        triangle(a,b,c);
        scanner.close();


    }
}
