package FirstStepsInCoding.exerscise;

import java.util.Scanner;

public class SupliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pencil = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int litersCleaner = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pencilPrice = pencil * 5.80 ;
        double markersPrice = markers * 7.20 ;
        double totalLiters = litersCleaner * 1.20 ;
        double percentDiscount = discount * 0.01 ;

        double totalSum = pencilPrice + markersPrice + totalLiters ;
        double realDeal = totalSum - (totalSum * percentDiscount);

        System.out.println(realDeal);
    }
}
