package FirstStepsInCoding.WhileLoopMoreExc;

import java.util.Scanner;

public class ReportSystem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moneyNeeded = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double cash = 0;
        double card = 0;
        int transaction = 0;
        int payedInCash = 0;
        int payedWithCard = 0;
        double sum = 0;
        while (!command.equals("End")) {
            int price = Integer.parseInt(command);
            transaction++;
            if (transaction % 2 != 0) {
                if (price > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    sum += price;
                    payedInCash++;
                    cash += price;
                    System.out.println("Product sold!");
                }
            } else {
                if (price < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    sum += price;
                    payedWithCard++;
                    card += price;
                    System.out.println("Product sold!");
                }
            }
            if (sum >= moneyNeeded) {
                System.out.printf("Average CS: %.2f%n", cash / payedInCash);
                System.out.printf("Average CC: %.2f", card / payedWithCard);
            break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
