package FirstStepsInCoding.lab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();

        System.out.println("You are " + firstName + " " + secondName + ", a " + age + "-years old person from " + town + "." );
    }
}
