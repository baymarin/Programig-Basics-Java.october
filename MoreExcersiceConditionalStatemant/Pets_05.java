package FirstStepsInCoding.MoreExcersiceConditionalStatemant;

import java.util.Scanner;

public class Pets_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysGone = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFoodGrams = Double.parseDouble(scanner.nextLine());

        double dogEat = dogFood * daysGone;
        double catEat = catFood * daysGone;
        double turtleEat = (turtleFoodGrams * daysGone) / 1000;
        double foodEaten = dogEat + catEat + turtleEat;
        double leftover = Math.abs(foodLeft - foodEaten);
        if (foodLeft >= foodEaten){
            System.out.printf("%.0f kilos of food left.",Math.floor(leftover));
        }else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(leftover));
        }
    }
}
