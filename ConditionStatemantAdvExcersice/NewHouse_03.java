package FirstStepsInCoding.ConditionStatemantAdvExcersice;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        //"Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        switch (flowers) {
            case "Roses":
                price = quantity * 5;
                if (quantity > 80) {
                    price = price * 0.90;

                }break;
            case "Dahlias":
                price = quantity * 3.80;
                if (quantity > 90) {
                    price = price * 0.85;

                }break;
            case "Tulips":
                price = quantity * 2.80;
                if (quantity > 80) {
                    price = price * 0.85;
                }
                break;
            case "Narcissus":
                price = quantity * 3;
                if (quantity < 120) {
                    price = price * 1.15;
                }
                break;
            case "Gladiolus":
                price = quantity * 2.50;
                if (quantity < 80) {
                    price = price * 1.20;
                }
                break;
         } double leftover = Math.abs(budget - price);
        if (price <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flowers, leftover );
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",leftover);
        }
    }
}