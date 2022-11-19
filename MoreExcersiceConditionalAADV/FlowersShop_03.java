package FirstStepsInCoding.MoreExcersiceConditionalAADV;

import java.util.Scanner;

public class FlowersShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtyChrysanthemum = Integer.parseInt(scanner.nextLine());
        int qtyRoses = Integer.parseInt(scanner.nextLine());
        int qtyTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String christmas = scanner.nextLine();
        double priceChrysanthemum = 0;
        double priceRoses = 0;
        double priceTulips = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                priceChrysanthemum = 2.00 * qtyChrysanthemum;
                priceRoses = 4.10 * qtyRoses;
                priceTulips = 2.50 * qtyTulips;
                break;
            case "Autumn":
            case "Winter":
                priceChrysanthemum = 3.75 * qtyChrysanthemum;
                priceRoses = 4.50 * qtyRoses;
                priceTulips = 4.15 * qtyTulips;
        }
        double sum = priceChrysanthemum + priceRoses + priceTulips;
        int allFlowers = qtyChrysanthemum + qtyRoses + qtyTulips;
        if (season.equals("Spring") && (qtyTulips >= 7)) {
            sum = sum * 0.95;
        } else if (season.equals("Winter") && (qtyRoses >= 10)) {
            sum = sum * 0.9;
        }if (allFlowers > 20) {
            sum = sum * 0.80;
        }
        if (christmas.equals("Y")) {
            sum = sum * 1.15;
        }
        System.out.printf("%.2f", sum + 2);
    }
}

