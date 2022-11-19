package FirstStepsInCoding.NestedLoopExcersice;

import java.util.Scanner;

public class SpecialNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1111; i <= 9999; i++) {
            int firstNum = i / 1000 % 10;
            int secondNum = i / 100 % 10;
            int thirdNum = i / 10 % 10;
            int forthNum = i % 10;

            boolean checkFirst = n % firstNum == 0;
            boolean checkSecond = secondNum != 0 && n % secondNum == 0;
            boolean checkThird = thirdNum != 0 && n % thirdNum == 0;
            boolean checkForth = forthNum != 0 && n % forthNum == 0;

            if (checkFirst && checkSecond && checkThird && checkForth) {
                System.out.printf("%d ", i);
            }
        }
    }
}
