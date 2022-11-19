package FirstStepsInCoding.NestedLoopExcersice;

import java.util.Scanner;

public class SumPrimeNonPrime_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int sumPrimeNum = 0;
        int sumNonPrimeNum = 0;
        while (!command.equals("stop")) {
            int num = Integer.parseInt(command);

            if (num < 0) {
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }
            int count = 1;
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count > 2) {
                sumNonPrimeNum += num;
            } else {
                sumPrimeNum += num;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrimeNum);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrimeNum);

    }
}
