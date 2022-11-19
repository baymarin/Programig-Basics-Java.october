package FirstStepsInCoding.moreExersice;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceSkumriq = Double.parseDouble(scanner.nextLine());
        double priceCaca = Double.parseDouble(scanner.nextLine());
        double palamudKG = Double.parseDouble(scanner.nextLine());
        double safridKG = Double.parseDouble(scanner.nextLine());
        double midiKG = Double.parseDouble(scanner.nextLine());

        double pricePalamud = priceSkumriq * 1.60 ;
        double priceSafrid = priceCaca * 1.80;
        double priceMidi = midiKG * 7.50 ;

        double amountPalamud = palamudKG * pricePalamud ;
        double amountSafrid = safridKG * priceSafrid ;
        double endPrice = amountPalamud + amountSafrid + priceMidi;
        System.out.printf("%.2f", endPrice);
    }
}
