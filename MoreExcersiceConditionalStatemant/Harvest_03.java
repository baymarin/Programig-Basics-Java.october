package FirstStepsInCoding.MoreExcersiceConditionalStatemant;

import java.util.Scanner;

public class Harvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squareMeters = Integer.parseInt(scanner.nextLine());
        double grapePerSquare = Double.parseDouble(scanner.nextLine());
        int neededLiters = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double allGrape = squareMeters * grapePerSquare ;
        double wine = (allGrape - allGrape * 0.6) / 2.5 ;
         if (wine >= neededLiters){
             double leftover = wine - neededLiters;
             double forTheWorkers = Math.ceil(leftover / workers) ;
             System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", wine);
             System.out.printf("%.0f liters left -> %.0f liters per person.",leftover, forTheWorkers);
             }else {
             double moreWine = Math.floor(neededLiters - wine) ;
             System.out.printf("It will be a tough winter! More %.0f liters wine needed.", moreWine);

        }
    }
}
