package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class EasterBakery_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceFlour = Double.parseDouble(scanner.nextLine());
        double flourKG = Double.parseDouble(scanner.nextLine());
        double sugarKG = Double.parseDouble(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int maq = Integer.parseInt(scanner.nextLine());
        double sugarPrice = priceFlour * 0.75;
        double priceEggs = (priceFlour * 1.10) * eggs;
        double priceMaq = (sugarPrice * 0.20) * maq;
        System.out.printf("%.2f", (priceFlour * flourKG) + (sugarPrice * sugarKG) + priceEggs + priceMaq);
    }
}
