package FirstStepsInCoding.MoreExcersiceConditionalAADV;

import java.util.Scanner;

public class MultiplyBy2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 100 ; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            if (num < 0){
                System.out.println("Negative number!");
            }else {
                System.out.printf("Result : %.2f", num * 2);
            }

        }

    }
}

