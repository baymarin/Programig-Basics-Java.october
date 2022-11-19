package FirstStepsInCoding.moreExersice;

import java.util.Scanner;

public class TrainingLab_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double areaHeight = (h * 100);
        double areaWidht = (w * 100) - 100;
        double numberOfRows = Math.floor(areaHeight / 120) ;
        double numberOfColumns = Math.floor(areaWidht / 70);
        double numberOfSeat = numberOfRows * numberOfColumns - 3 ;

        System.out.printf("%.0f", numberOfSeat);




    }
}
