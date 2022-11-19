package FirstStepsInCoding.exerscise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantityNylon = Integer.parseInt(scanner.nextLine());
        int quantityPaint = Integer.parseInt(scanner.nextLine());
        int quantityDiluent = Integer.parseInt(scanner.nextLine());
        int hoursNeeded = Integer.parseInt(scanner.nextLine());

        double nylonSum = (quantityNylon + 2) * 1.50 ;
        double paintSum = (quantityPaint + 0.1 * quantityPaint) * 14.50 ;
        double diluentSum = quantityDiluent * 5.00 ;
        double bag = 0.40 ;

        double materialSum = nylonSum + paintSum + diluentSum + bag ;
        double workers = ( materialSum * 0.3 ) * hoursNeeded ;

        double endPrice = materialSum + workers ;

        System.out.println(endPrice);
    }

}
