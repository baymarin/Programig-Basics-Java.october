package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class EasterBake_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountCake = Integer.parseInt(scanner.nextLine());
        int sugarGrams = 0;
        int flourGrams = 0;
        int maxUsed = Integer.MIN_VALUE;
        int maxSugar = Integer.MIN_VALUE;
        for (int i = 1; i <= amountCake ; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());
            sugarGrams += sugar;
            flourGrams += flour;
           if (flour > maxUsed){
               maxUsed = flour;
           }if (sugar > maxSugar){
               maxSugar = sugar;
            }
        }
        double sugarPackets = Math.ceil(1.0 * sugarGrams / 950);
        double flourPackets = Math.ceil(1.0 * flourGrams / 750);
        System.out.printf("Sugar: %.0f%n",sugarPackets);
        System.out.printf("Flour: %.0f%n",flourPackets);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxUsed , maxSugar);
    }
}
