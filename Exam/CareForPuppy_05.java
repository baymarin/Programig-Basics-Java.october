package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class CareForPuppy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boughtFood = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int foodInGrams = boughtFood * 1000;
        int sumEaten = 0;
        while (!command.equals("Adopted")) {
            int eatenFood = Integer.parseInt(command);
            sumEaten += eatenFood;

            command = scanner.nextLine();
        }
        if (command.equals("Adopted") && foodInGrams >= sumEaten) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGrams - sumEaten);
        }
        if (foodInGrams < sumEaten) {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(foodInGrams - sumEaten));
        }
    }
}
