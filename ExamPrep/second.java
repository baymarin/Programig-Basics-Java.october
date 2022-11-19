package FirstStepsInCoding.ExamPrep;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceShirt = Double.parseDouble(scanner.nextLine());
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double priceShort = priceShirt * 0.75;
        double priceSocks = priceShort * 0.2;
        double priceShoes = (priceShirt + priceShort) * 2;
        double sum = (priceShirt + priceShort + priceSocks + priceShoes) * 0.85 ;
        if (sum >= neededMoney){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", sum);
        }else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", neededMoney - sum);
        }
    }
}
