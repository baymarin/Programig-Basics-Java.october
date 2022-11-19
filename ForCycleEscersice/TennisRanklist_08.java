package FirstStepsInCoding.ForCycleEscersice;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int startingPoint = Integer.parseInt(scanner.nextLine());
        int sumAllPoints = 0;
        int wins = 0;
        for (int i = 1; i <= n; i++) {
            String position = scanner.nextLine();
            switch (position){
                case "W":
                    sumAllPoints += 2000;
                    wins ++;
                    break;
                case "F":
                    sumAllPoints += 1200;
                    break;
                case "SF":
                    sumAllPoints += 720;
                    break;
            }
        }
        System.out.printf("Final points: %d%n", startingPoint + sumAllPoints);
        System.out.printf("Average points: %d%n", sumAllPoints / n);
        System.out.printf("%.2f%%%n", 1.0 * wins / n * 100 );
    }
}
