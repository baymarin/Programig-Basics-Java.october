package FirstStepsInCoding.IfElseExcercise;

import java.util.Scanner;

public class ToyStore_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int speakingDoll = Integer.parseInt(scanner.nextLine());
        int teddyBear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        double priceToys = puzzle * 2.60 + speakingDoll * 3 + teddyBear * 4.10 + minion * 8.20 + truck * 2 ;
        int amountToys = puzzle + speakingDoll + teddyBear + minion + truck ;

        if (amountToys >= 50){
            priceToys = priceToys * 0.75 ;
        }
        priceToys = priceToys * 0.90 ;
        if (priceExcursion <= priceToys){
            System.out.printf("Yes! %.2f lv left.", priceToys - priceExcursion);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", priceExcursion - priceToys);
        }


    }
}
