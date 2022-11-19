package FirstStepsInCoding.moreExersice;

import java.util.Scanner;

public class VegetableMarket_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegetablePrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        int weightVegetable = Integer.parseInt(scanner.nextLine());
        int weightFruit = Integer.parseInt(scanner.nextLine());
        double levaPrice = (vegetablePrice * weightVegetable) + (fruitPrice * weightFruit);

        double euroPrice = levaPrice / 1.94;
        System.out.printf("%.2f", euroPrice);
    }
}
