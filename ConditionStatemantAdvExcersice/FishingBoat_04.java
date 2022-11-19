package FirstStepsInCoding.ConditionStatemantAdvExcersice;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (season) {
            case "Summer":
                price = 4200;
                if (fishers % 2 == 0) {
                    price = price * 0.95;
                }
                break;
            case "Spring":
                price = 3000;
                if (fishers % 2 == 0) {
                    price = price * 0.95;
                }
                break;
            case "Winter":
                price = 2600;
                if (fishers % 2 == 0) {
                    price = price * 0.95;
                }
                break;
            case "Autumn":
                price = 4200;
                break;
        }
        if (fishers <= 6) {
            price = price * 0.90;
        } else if (fishers > 7 && fishers <= 11) {
            price = price * 0.85;
        } else if (fishers >= 12) {
            price = price * 0.75;
        }
        double realPrice = Math.abs(budget - price);
        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", realPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", realPrice);
        }
    }
}