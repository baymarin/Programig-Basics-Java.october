package FirstStepsInCoding.ForLoopMoreExcercises;

import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int yearDie = Integer.parseInt(scanner.nextLine());
        int age = 18;
        double leftovers = 0;
        double oddLeftovers = 0;

        for (int i = 1800; i <= yearDie; i++) {

            if (age % 2 == 0) {
                leftovers += 12000;
            } else {
                oddLeftovers += (12000 + (50 * age));
            }
            age++;
        }
        double netMoney = money - leftovers - oddLeftovers;
        if (netMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", netMoney);
        }
        if (netMoney < 0) {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(netMoney));

        }
    }
}
