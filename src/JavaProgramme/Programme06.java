package JavaProgramme;

import java.util.Scanner;

public class Programme06 {
    //radius value of the circle and observing area
    public static void circleArea(double radius){
       double area = Math.PI * radius * radius;
       System.out.println("area of circle: "+ area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter radius of circle: ");
        double raduis = scanner.nextDouble();
        circleArea(raduis);
        scanner.close();


    }

}
