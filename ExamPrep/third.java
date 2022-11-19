package FirstStepsInCoding.ExamPrep;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weightParcel = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());
        double pricePerKM = 0;
        double expenses = 0;
        if (weightParcel < 1) {
            pricePerKM = 0.03;
        } else if (weightParcel < 10) {
            pricePerKM = 0.05;
        } else if (weightParcel < 40) {
            pricePerKM = 0.10;
        } else if (weightParcel < 90) {
            pricePerKM = 0.15;
        } else if (weightParcel < 150) {
            pricePerKM = 0.20;
        }
        switch (type) {
            case "express":
                if (weightParcel < 1) {
                    expenses = pricePerKM * 0.8;
                } else if (weightParcel < 10) {
                    expenses = pricePerKM * 0.4;
                } else if (weightParcel < 40) {
                    expenses = pricePerKM * 0.05;
                } else if (weightParcel < 90) {
                    expenses = pricePerKM * 0.02;
                } else if (weightParcel < 150) {
                    expenses = pricePerKM * 0.01;
                }
                break;
        }
        double totalExpenses = weightParcel * expenses;
        double sum = (distance * pricePerKM) + (totalExpenses * distance);
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weightParcel, sum);
    }
}
