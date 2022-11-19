package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class EnergyBooster_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int amount = 0;
        double price = 0;
        if (fruit.equals("Watermelon")) {
            switch (size) {
                case "small":
                    quantity = 2 * quantity;
                    price = 56 * quantity;
                    break;
                case "big":
                    quantity = 5 * quantity;
                    price = 28.70 * quantity;
                    break;
            }
        } else if (fruit.equals("Mango")) {
            switch (size) {
                case "small":
                    quantity = 2 * quantity;
                    price = quantity * 36.66;
                    break;
                case "big":
                    quantity = 5 * quantity;
                    price = quantity * 19.60;
            }
        } else if (fruit.equals("Pineapple")) {
            switch (size) {
                case "small":
                    quantity = 2 * quantity;
                    price = quantity * 42.10;
                    break;
                case "big":
                    quantity = 5 * quantity;
                    price = quantity * 24.80;
                    break;
            }
        } else if (fruit.equals("Raspberry")) {
            switch (size) {
                case "small":
                    quantity = 2 * quantity;
                    price = quantity * 20;
                    break;
                case "big":
                    quantity = 5 * quantity;
                    price = quantity * 15.20;
                    break;
            }
        }
        if (price >= 400 && price <= 1000) {
            price = price * 0.85;
        } else if (price > 1000) {
            price = price * 0.5;
        }
        System.out.printf("%.2f lv.", price);
    }
}
