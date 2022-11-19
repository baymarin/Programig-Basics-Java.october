package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class FruitMarket_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceStrawberryKG = Double.parseDouble(scanner.nextLine());
        double bananaKG = Double.parseDouble(scanner.nextLine());
        double orangeKG = Double.parseDouble(scanner.nextLine());
        double raspberryKG = Double.parseDouble(scanner.nextLine());
        double strawberryKG = Double.parseDouble(scanner.nextLine());

        double priceStrawberry = strawberryKG * priceStrawberryKG;
        double priceRaspberry = priceStrawberryKG * 0.5;
        double priceOrange = priceRaspberry * 0.6;
        double priceBanana = priceRaspberry * 0.2;

        double sum = (priceRaspberry * raspberryKG) + (priceBanana * bananaKG) + (priceOrange * orangeKG) + priceStrawberry;
        System.out.printf("%.2f", sum);
    }
}
