package FirstStepsInCoding.exerscise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int timeLap = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());
        double percentInterest = interest * 0.01;

        double realSum = depositSum + timeLap * ((depositSum * percentInterest) /12 );

        System.out.println(realSum);
    }
}
