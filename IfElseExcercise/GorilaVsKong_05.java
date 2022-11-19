package FirstStepsInCoding.IfElseExcercise;

import java.util.Scanner;

public class GorilaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double priceStatist = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1 ;
        double clothing = statist * priceStatist ;
        if (statist > 150){
            clothing = clothing * 0.90;
        }
        double price = decor + clothing ;
        if (price > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", price - budget);
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - price);
        }

    }
}
