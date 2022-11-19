package FirstStepsInCoding.ConditionStatemantAdv;

import java.util.Scanner;

public class AppleStrore_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String food = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double qty = Double.parseDouble(scanner.nextLine());
        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") ||
                dayOfWeek.equals("Friday")) {
            switch (food) {
                case "banana":
                    qty = qty * 2.50;
                    System.out.printf("%.2f ", qty);
                    break;
                case "apple":
                    qty = qty * 1.20;
                    System.out.printf("%.2f ", qty);
                    break;
                case "orange":
                    qty = qty * 0.85;
                    System.out.printf("%.2f ", qty);
                    break;
                case "grapefruit":
                    qty = qty * 1.45;
                    System.out.printf("%.2f ", qty);
                    break;
                case "kiwi":
                    qty = qty * 2.70;
                    System.out.printf("%.2f ", qty);
                    break;
                case "pineapple":
                    qty = qty * 5.50;
                    System.out.printf("%.2f ", qty);
                    break;
                case "grapes":
                    qty = qty * 3.85;
                    System.out.printf("%.2f ", qty);
                    break;
                default:
                    System.out.println("error");
            }
        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            switch (food) {
                case "banana":
                    qty = qty * 2.70;
                    System.out.printf("%.2f ", qty);
                    break;
                case "apple":
                    qty = qty * 1.25;
                    System.out.printf("%.2f ", qty);
                    break;
                case "orange":
                    qty = qty * 0.90;
                    System.out.printf("%.2f ", qty);
                    break;
                case "grapefruit":
                    qty = qty * 1.60;
                    System.out.printf("%.2f ", qty);
                    break;
                case "kiwi":
                    qty = qty * 3.00;
                    System.out.printf("%.2f ", qty);
                    break;
                case "pineapple":
                    qty = qty * 5.60;
                    System.out.printf("%.2f ", qty);
                    break;
                case "grapes":
                    qty = qty * 4.20;
                System.out.printf("%.2f ", qty);
                break;
                default:
                    System.out.println("error");
            }
        }
        else
            System.out.println("error");

    }
}