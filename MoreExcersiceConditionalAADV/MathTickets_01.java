package FirstStepsInCoding.MoreExcersiceConditionalAADV;

import java.util.Scanner;

public class MathTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int ppl = Integer.parseInt(scanner.nextLine());
        double transport = 0;
        double price = 0;
        if (ppl >= 1 && ppl <= 4) {
            transport = budget * 0.75;
        } else if (ppl >= 5 && ppl <= 9) {
            transport = budget * 0.60;
        } else if (ppl >= 10 && ppl <= 24) {
            transport = budget * 0.5;
        } else if (ppl >= 25 && ppl <= 49) {
            transport = budget * 0.4;
        } else if (ppl >= 50) {
            transport = budget * 0.25;
        }
        if (category.equals("VIP")) {
            price = 499.99;
        } else if (category.equals("Normal")) {
            price = 249.99;
        }
        double cost = (price * ppl) + transport;
        double difference = Math.abs(cost - budget);

        if (cost > budget) {
            System.out.printf("Not enough money! You need %.2f leva.", difference);
        } else {
            System.out.printf("Yes! You have %.2f leva left.", difference);
        }
    }
}