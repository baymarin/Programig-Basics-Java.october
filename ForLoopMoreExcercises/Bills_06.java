package FirstStepsInCoding.ForLoopMoreExcercises;

import java.util.Scanner;

public class Bills_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = Integer.parseInt(scanner.nextLine());
        double electricitySum = 0;
        double water = 0;
        double internet = 0;
        double other = 0;

        for (int i = 1; i <= month; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            electricitySum += electricity;
            water += 20;
            internet += 15;
            other += (electricity + 20 + 15) * 1.2;

        }
        double average = (electricitySum + water + internet + other) / month ;
        System.out.printf("Electricity: %.2f lv%n", electricitySum);
        System.out.printf("Water: %.2f lv%n", water);
        System.out.printf("Internet: %.2f lv%n", internet);
        System.out.printf("Other: %.2f lv%n", other);
        System.out.printf("Average: %.2f lv", average);
    }
}
