package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class DivisionWithoutRemainder_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        for (int i = 1; i <= num; i++) {
            int numberNeeded = Integer.parseInt(scanner.nextLine());
            if (numberNeeded % 2 == 0){
                p1 ++;
            }if (numberNeeded % 3 == 0){
                p2 ++;
            }if (numberNeeded % 4 == 0){
                p3 ++;
            }

        }
        System.out.printf("%.2f%%%n", (1.0 * p1 / num) * 100);
        System.out.printf("%.2f%%%n", (1.0 * p2 / num) * 100);
        System.out.printf("%.2f%%%n", (1.0 * p3 / num) * 100);
    }
}
