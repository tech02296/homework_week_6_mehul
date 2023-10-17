     package JavaProgramme;

     import java.util.Scanner;

     public class Programme14 {
    //print the area and perimeter of a rectangle.
    public static void perimeter(double width, double height) {
        double perimeter = (2 * (height + width));
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);
    }
    public static void area(double width, double height) {
        double area = width * height;
        System.out.println("Area is " + width + " * " + height + " = " + area);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Please enter height:");

        double height = scanner.nextDouble();
        perimeter(width, height);
        area(width, height);


    }
}
