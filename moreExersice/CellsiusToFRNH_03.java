package FirstStepsInCoding.moreExersice;

import java.util.Scanner;

public class CellsiusToFRNH_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cellsius = Double.parseDouble(scanner.nextLine());

        double fahrenheit = cellsius * 1.8 + 32 ;
        System.out.printf("%.2f", fahrenheit);
    }
}
