package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class AluminumJoinery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();
        double price = 0;
        if (type.equals("90X130")) {
            price = quantity * 110;
            if (quantity >= 30 && quantity < 60) {
                price = price * 0.95;
            } else if (quantity >= 60) {
                price = price * 0.92;
            } else if (quantity >= 10) {
                price = quantity * 110;
            }

        } else if (type.equals("100X150")) {
            price = quantity * 140;
            if (quantity >= 40 && quantity < 80) {
                price = price * 0.94;
            } else if (quantity >= 80) {
                price = price * 0.9;
            } else if (quantity >= 10) {
                price = quantity * 140;
            }
        } else if (type.equals("130X180")) {
            price = quantity * 190;
            if (quantity >= 20 && quantity < 50) {
                price = price * 0.93;
            } else if (quantity >= 50) {
                price = price * 0.88;
            } else if (quantity >= 10) {
                price = quantity * 190;
            }
        } else if (type.equals("200X300")) {
            price = quantity * 250;
            if (quantity >= 25 && quantity < 50) {
                price = price * 0.91;
            } else if (quantity >= 50) {
                price = price * 0.86;
            } else if (quantity >= 10) {
                price = quantity * 250;
            }
        }
        if ("With delivery".

                equals(delivery)) {
            price = price + 60;
        }
        if (quantity > 99) {
            price = price * 0.96;
        }
        if (quantity < 10) {
            System.out.println("Invalid order");
        } else {
            System.out.printf("%.2f BGN", price);
            ;
        }
    }
}
