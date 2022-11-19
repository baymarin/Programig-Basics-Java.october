package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class BarcodeGenerator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        int currentFirst = first / 1000 % 10;
        int currentSecond = first / 100 % 10;
        int currentThird = first / 10 % 10;
        int currentForth = first % 10;

        int secondFirst = second / 1000 % 10;
        int secondSecond = second / 100 % 10;
        int secondThird = second / 10 % 10;
        int secondForth = second % 10;

        for (int i = currentFirst; i <= secondFirst ; i++) {
            for (int j = currentSecond; j <= secondSecond ; j++) {
                for (int k = currentThird; k <=secondThird ; k++) {
                    for (int l = currentForth; l <= secondForth ; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0){
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }

                }

            }

        }

    }
}

