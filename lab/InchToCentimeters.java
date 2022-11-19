package FirstStepsInCoding.lab;

import java.util.Scanner;

public class InchToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double inch = Double.parseDouble(scanner.nextLine());
        Double centimeters = inch * 2.54;

        System.out.println(centimeters);
    }
}
