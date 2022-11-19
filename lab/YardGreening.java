package FirstStepsInCoding.lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double meters = Double.parseDouble(scanner.nextLine());
        Double wholeSum = meters * 7.61 ;
        Double discount = 0.18 * wholeSum ;
        Double properPrice = wholeSum - discount ;

        System.out.println("The final price is: " + properPrice);
        System.out.println("The discount is : " + discount );

    }
}
