package FirstStepsInCoding.ExamPrep;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paper = Integer.parseInt(scanner.nextLine());
        int cotton = Integer.parseInt(scanner.nextLine());
        double glueLitters = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pricePaper = paper * 5.80;
        double priceCotton = cotton * 7.20;
        double priceGlue = glueLitters * 1.20;
        double sum = pricePaper + priceCotton + priceGlue;
        double discountPercent = discount * 0.01;
        double sumDiscount = sum - (sum * discountPercent);
        System.out.printf("%.3f", sumDiscount);
    }
}
