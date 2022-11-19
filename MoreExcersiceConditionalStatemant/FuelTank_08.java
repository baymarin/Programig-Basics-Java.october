package FirstStepsInCoding.MoreExcersiceConditionalStatemant;

import java.util.Scanner;

public class FuelTank_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFuel = scanner.nextLine();
        double amountFuel = Double.parseDouble(scanner.nextLine());
        String cardDiscount = scanner.nextLine();
        double price = 0;
        double discount = 0;
        switch (typeFuel) {
            case "Gas":
                price = amountFuel * 0.93;
                    if (amountFuel >= 20 && amountFuel <= 25) {
                        price = price - (price * 0.08);
                    } else if (amountFuel > 25) {
                        price = price - (price * 0.1);
                    } if (cardDiscount.equals("Yes")) {
                discount = amountFuel * 0.08;
            }   break;
            case "Diesel":
                price = amountFuel * 2.33;
                    if (amountFuel >= 20 && amountFuel <= 25) {
                        price = price - (price * 0.08);
                    } else if (amountFuel > 25) {
                        price = price - (price * 0.1);
                    }if (cardDiscount.equals("Yes")) {
                discount = amountFuel * 0.12;
            }break;

            case "Gasoline":
                price = amountFuel * 2.22;
                    if (amountFuel >= 20 && amountFuel <= 25) {
                        price = price - (price * 0.08);
                    } else if (amountFuel > 25) {
                        price = price - (price * 0.1);
                    } if (cardDiscount.equals("Yes")) {
                discount = amountFuel * 0.18;
            }break;

        }
        System.out.printf("%.2f", price - discount);
    }
}

