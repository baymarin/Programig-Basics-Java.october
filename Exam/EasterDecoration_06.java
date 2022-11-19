package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class EasterDecoration_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clients = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;

        for (int i = 1; i <= clients; i++) {
            String product = scanner.nextLine();
            int qtyProducts = 0;
            double payed = 0;
            while (!product.equals("Finish")) {
                switch (product) {
                    case "basket":
                        payed += 1.50;
                        qtyProducts++;
                        break;
                    case "wreath":
                        payed += 3.80;
                        qtyProducts++;
                        break;
                    case "chocolate bunny":
                        payed += 7;
                        qtyProducts++;
                        break;
                }
                product = scanner.nextLine();
            }

            if (qtyProducts % 2 == 0) {
                payed *= 0.8;
            }
            System.out.printf("You purchased %d items for %.2f leva.%n", qtyProducts, payed);
            totalSum += payed;
        }
        System.out.printf("Average bill per client is: %.2f leva.", totalSum / clients);
    }
}
