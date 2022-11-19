package FirstStepsInCoding.ForLoopMoreExcercises;

import java.util.Scanner;

public class Logistics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int packages = Integer.parseInt(scanner.nextLine());
        double priceBus = 0;
        double priceTruck = 0;
        double priceTrain = 0;
        int wholeWeight = 0;
        int tonBus = 0;
        int tonTruck = 0;
        int tonTrain = 0;
        for (int i = 1; i <= packages; i++) {
            int weight = Integer.parseInt(scanner.nextLine());
            if (weight <= 3) {
                priceBus += 200 * weight;
                wholeWeight += weight;
                tonBus += weight;
            } else if (weight <= 11) {
                priceTruck += 175 * weight;
                wholeWeight += weight;
                tonTruck += weight;
            } else if (weight >= 12) {
                priceTrain += 120 * weight;
                wholeWeight += weight;
                tonTrain += weight;
            }

        }
        double averagePerTon = (priceBus + priceTruck + priceTrain) / wholeWeight;
        double percentBus = ( 1.0 * tonBus / wholeWeight) * 100 ;
        double percentTruck = ( 1.0 * tonTruck / wholeWeight) * 100 ;
        double percentTrain = ( 1.0 * tonTrain / wholeWeight) * 100 ;
        System.out.printf("%.2f%n", averagePerTon);
        System.out.printf("%.2f%%%n", percentBus);
        System.out.printf("%.2f%%%n", percentTruck);
        System.out.printf("%.2f%%%n", percentTrain);
    }
}
