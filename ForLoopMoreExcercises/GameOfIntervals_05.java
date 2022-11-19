package FirstStepsInCoding.ForLoopMoreExcercises;

import java.util.Scanner;

public class GameOfIntervals_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double score = 0;
        int num0to9 = 0;
        int num10to19 = 0;
        int num20to29 = 0;
        int num30to39 = 0;
        int num40to50 = 0;
        int invalidNum = 0;
        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            if (numbers >= 0 && numbers < 10) {
                num0to9++;
                score += numbers * 0.2;
            } else if (numbers >= 10 && numbers < 20) {
                num10to19++;
                score += numbers * 0.3;
            } else if (numbers >= 20 && numbers < 30) {
                num20to29++;
                score += numbers * 0.4;
            } else if (numbers >= 30 && numbers < 40){
                num30to39 ++;
                score += 50;
            }else if (numbers >= 40 && numbers <= 50){
                num40to50 ++;
                score += 100;
            }else {
                invalidNum ++;
                score = score / 2;
            }


        }
        System.out.printf("%.2f%n", score);
        System.out.printf("From 0 to 9: %.2f%%%n", (1.0 * num0to9 / n) * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", (1.0 * num10to19 / n) * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", (1.0 * num20to29 / n) * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", (1.0 * num30to39 / n) * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", (1.0 * num40to50 / n) * 100);
        System.out.printf("Invalid numbers: %.2f%%", (1.0 * invalidNum / n) * 100);
    }
}
