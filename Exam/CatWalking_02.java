package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class CatWalking_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int walkPerDay = Integer.parseInt(scanner.nextLine());
        int qtyWalksPerDay = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = (walkPerDay * 5) * qtyWalksPerDay;
        int caloriesToBurn = calories / 2 ;
        if (caloriesPerDay >= caloriesToBurn){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",caloriesPerDay );
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", caloriesPerDay);
        }
    }
}
