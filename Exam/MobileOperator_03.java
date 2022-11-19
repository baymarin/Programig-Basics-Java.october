package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class MobileOperator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contractTime = scanner.nextLine();
        String contractType = scanner.nextLine();
        String internet = scanner.nextLine();
        double price = 0;
        int months = Integer.parseInt(scanner.nextLine());
        if (contractTime.equals("one")) {
            switch (contractType) {
                case "Small":
                    price = 9.98;
                    break;
                case "Middle":
                    price = 18.99;
                    break;
                case "Large":
                    price = 25.98;
                    break;
                case "ExtraLarge":
                    price = 35.99;
                    break;
            }
        } else if (contractTime.equals("two")) {
            switch (contractType) {
                case "Small":
                    price = 8.58;
                    break;
                case "Middle":
                    price = 17.09;
                    break;
                case "Large":
                    price = 23.59;
                    break;
                case "ExtraLarge":
                    price = 31.79;
                    break;
            }
        }
        switch (internet) {
            case "yes":
                if (price <= 10) {
                    price += 5.50;
                } else if (price <= 30) {
                    price += 4.35;
                } else {
                    price += 3.85;
                }
        }
        double totalPrice = months * price;
        if (contractTime.equals("two")){
            totalPrice = totalPrice - (totalPrice * 0.0375) ;
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}