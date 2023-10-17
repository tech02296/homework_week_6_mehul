package JavaProgramme;

import java.util.Scanner;

public class Programme09 {
    // convert the upper case to lower case
    public static void convertUpperCaseToLower(String str) {
        String lowercase = str.toLowerCase();
        System.out.println(lowercase);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the text");
        String text = scanner.next();
        convertUpperCaseToLower(text);
        scanner.close();
    }

}




