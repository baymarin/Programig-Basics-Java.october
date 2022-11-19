package FirstStepsInCoding.ForLoopMoreExcercises;

import java.util.Scanner;
public class EqualPairs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int firstPair = 0;
        int secondPair = 0;
        int difference = 0;
        boolean isValid = true;
        for (int i = 1; i <= n; i++) {
            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                secondPair = number1 + number2;
            } else {
                firstPair = number1 + number2;
            }
            if (secondPair == firstPair || n < 2) {
                isValid = true;
            } else {
                isValid = false;
                difference = Math.abs(firstPair - secondPair);
            }
        }
        if (isValid) {
            System.out.printf("Yes, value=%d", firstPair);
        } else {
            System.out.printf("No, maxdiff=%d", difference);

        }
    }
}
