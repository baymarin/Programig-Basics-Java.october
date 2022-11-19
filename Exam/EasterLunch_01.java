package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class EasterLunch_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int qtyKozunak = Integer.parseInt(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int cookiesKG = Integer.parseInt(scanner.nextLine());
        double priceKozunak = qtyKozunak * 3.20;
        double priceEggs = eggs  * 4.35;
        double priceCookies = cookiesKG * 5.40;
        double eggPaint = (eggs * 12) * 0.15;
        System.out.printf("%.2f", priceCookies + eggPaint + priceEggs + priceKozunak);
    }
}
