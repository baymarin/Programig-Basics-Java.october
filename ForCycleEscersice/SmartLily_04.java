package FirstStepsInCoding.ForCycleEscersice;

import java.util.Scanner;

public class SmartLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double priceLaundry = Double.parseDouble(scanner.nextLine());
        int qtyToys = Integer.parseInt(scanner.nextLine());
        int moneyBirthdays = 0;
        int toys = 0;
        int moneyFromToys = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                moneyBirthdays += i * 5 - 1;
            } else {
                toys++;
                moneyFromToys = toys * qtyToys;
            }
        }
        int moneys = moneyBirthdays + moneyFromToys;
        double diff = Math.abs(moneys - priceLaundry);
        if (moneys >= priceLaundry) {
            System.out.printf("Yes! %.2f", diff);
        }else {
            System.out.printf("No! %.2f", diff);
        }

    }

}
