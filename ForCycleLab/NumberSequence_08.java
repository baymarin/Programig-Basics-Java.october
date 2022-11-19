package FirstStepsInCoding.ForCycleLab;

import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < num; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (maxNumber < number) {
                maxNumber = number;
            }
            if (minNumber > number) {
                minNumber = number;

            }
        }
        System.out.printf("Max number: %d%n", maxNumber);
        System.out.printf("Min number: %d", minNumber);

    }
}
