package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class FoodForPets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());
        double eatenByDog = 0;
        double eatenByCat = 0;
        double biscuit = 0;
        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());
            eatenByDog += dogFood;
            eatenByCat += catFood;
            if (i % 3 == 0) {
                biscuit += (dogFood + catFood) * 0.1;
            }
        }
        double totalEaten = eatenByCat + eatenByDog;
        double eatenInPercent = (totalEaten / totalFood) * 100;
        double eatenDogPercent = (eatenByDog / totalEaten) * 100;
        double eatenCatPercent = (eatenByCat / totalEaten) * 100 ;
        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuit);
        System.out.printf("%.2f%% of the food has been eaten.%n", eatenInPercent);
        System.out.printf("%.2f%% eaten from the dog.%n", eatenDogPercent);
        System.out.printf("%.2f%% eaten from the cat.%n", eatenCatPercent);
    }
}