package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class VetParking_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double totalSum = 0 ;
        for (int i = 1; i <= days; i++) {
            double price = 0;
            double sum = 0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    price = 2.50;
                    sum += price;
                } else if (i % 2 != 0 && j % 2 == 0){
                    price = 1.25;
                    sum += price;
                }else {
                    price = 1;
                    sum += price;
                }
            }
            totalSum += sum;
            System.out.printf("Day: %d - %.2f leva%n", i, sum);

        }
        System.out.printf("Total: %.2f leva", totalSum);
    }
}
