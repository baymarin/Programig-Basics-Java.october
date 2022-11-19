package FirstStepsInCoding.ConditionStatemantAdvExcersice;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int redowe = Integer.parseInt(scanner.nextLine());
        int koloni = Integer.parseInt(scanner.nextLine());
        double amount = redowe * koloni;
        double price = 0;
        if (type.equals("Premiere")){
            price = 12.00;
            System.out.printf("%.2f leva",amount * price);
        }else if (type.equals("Normal")){
            price = 7.50;
            System.out.printf("%.2f leva", amount * price);
        }else if (type.equals("Discount")){
            price = 5.00;
            System.out.printf("%.2f leva ",amount * price);
        }

    }
}
