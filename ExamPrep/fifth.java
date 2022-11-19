package FirstStepsInCoding.ExamPrep;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double target = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        double moneyCollected = 0;
        while (!type.equals("closed")) {
            String gender = scanner.nextLine();
            double price = 0;
            switch (type) {
                case "haircut":
                    if (gender.equals("mens")) {
                        price = 15;
                    } else if (gender.equals("ladies")) {
                        price = 20;
                    } else if (gender.equals("kids")) {
                        price = 10;
                    }
                    break;
                case "color":
                    if (gender.equals("touch up")) {
                        price = 20;
                    } else if (gender.equals("full color")) {
                        price = 30;
                    }
                    break;
            }
            moneyCollected += price;
            if (moneyCollected >= target) {
                System.out.println("You have reached your target for the day!");
                System.out.printf("Earned money: %.0flv.", moneyCollected);
                break;
            }

            type = scanner.nextLine();
        }
        if (moneyCollected < target){
            System.out.printf("Target not reached! You need %.0flv. more.%n", target - moneyCollected);
            System.out.printf("Earned money: %.0flv.", moneyCollected);
        }
    }
}
