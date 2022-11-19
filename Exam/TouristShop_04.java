package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class TouristShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String product = scanner.nextLine();
        int counter = 0;
        double spendMoney = 0;
        while (!product.equals("Stop")) {
            double priceProduct = Double.parseDouble(scanner.nextLine());
            counter++;

            if (counter % 3 == 0) {
                priceProduct *= 0.5;
            }
            budget -= priceProduct;
            spendMoney += priceProduct;
            if (0 > budget) {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", Math.abs(budget));
                break;
            }
            product = scanner.nextLine();
        }
        if (budget >= 0) {
            System.out.printf("You bought %d products for %.2f leva.", counter, spendMoney);
        }
    }
}
