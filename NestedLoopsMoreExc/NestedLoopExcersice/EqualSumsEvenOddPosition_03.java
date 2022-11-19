package FirstStepsInCoding.NestedLoopExcersice;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        for (int first = firstNumber; first <= secondNumber; first++) {
            int currentSixthNum = first % 10;
            int currentFifthNum = first / 10 % 10;
            int currentForthNum = first / 100 % 10;
            int currentThirdNum = first / 1000 % 10;
            int currentSecondNum = first / 10000 % 10;
            int currentFirstNum = first / 100000 % 10;

            int sumOdd = currentFirstNum + currentThirdNum + currentFifthNum;
            int sumEven = currentSecondNum + currentForthNum + currentSixthNum ;

            if (sumOdd == sumEven){
                System.out.printf("%d ", first);
            }

        }
    }
}
