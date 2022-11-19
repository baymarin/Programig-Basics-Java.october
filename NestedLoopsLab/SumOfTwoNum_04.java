package FirstStepsInCoding.NestedLoopsLab;

import java.util.Scanner;

public class SumOfTwoNum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int firstNum = 0;
        int secondNum = 0;
        boolean isFound = false;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counter++;
                if (i + j == magicNumber) {
                    isFound = true;
                    firstNum = i;
                    secondNum = j;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (isFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", counter, firstNum, secondNum , magicNumber);
        }else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}