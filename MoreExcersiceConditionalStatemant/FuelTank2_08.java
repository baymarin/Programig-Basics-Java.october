package FirstStepsInCoding.MoreExcersiceConditionalStatemant;

import java.util.Scanner;

public class FuelTank2_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFuel = scanner.nextLine();
        double amountFuel = Double.parseDouble(scanner.nextLine());
        String cardDiscount = scanner.nextLine();
        double price = 0;

        if (typeFuel.equals("Gasoline")) {
            price = amountFuel * 2.22;
            if (cardDiscount.equals("Yes")) {
                price = amountFuel * (2.22 - 0.18);
            }
            if (amountFuel >= 20 && amountFuel <= 25) {
                price = price - (price * 0.08);
            } else if (amountFuel > 25) {
                price = price - (price * 0.1);
            }
        } else if (typeFuel.equals("Diesel")) {

            price = amountFuel * 2.33;
            if (cardDiscount.equals("Yes")) {
                price = amountFuel * (2.33 - 0.12);
            }
            if (amountFuel >= 20 && amountFuel <= 25) {
                price = price - (price * 0.08);
            } else if (amountFuel > 25) {
                price = price - (price * 0.1);

            }
        } else if (typeFuel.equals("Gas")) {
            price = amountFuel * 0.93;
            if (cardDiscount.equals("Yes")) {
                price = amountFuel * (0.93 - 0.08);
            }
            if (amountFuel >= 20 && amountFuel <= 25) {
                price = price - (price * 0.08);
            } else if (amountFuel > 25) {
                price = price - (price * 0.1);
            }
        }
        System.out.printf("%.2f lv.", price);
    }
}
