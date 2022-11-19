package FirstStepsInCoding.MoreExcersiceConditionalAADV;

import java.util.Scanner;

public class TruckDriver_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double KM = Double.parseDouble(scanner.nextLine());
        double earnPerKM = 0;
        switch (season) {
            case "Spring":
            case "Autumn":
                if (KM <= 5000) {
                    earnPerKM = (KM * 0.75) * 4;
                } else if (KM <= 10000) {
                    earnPerKM = (KM * 0.95) * 4;
                }break;
            case "Summer":
                if (KM <= 5000) {
                    earnPerKM = (KM * 0.9) * 4;
                } else if (KM <= 10000) {
                    earnPerKM = (KM * 1.1) * 4;

                }break;
            case "Winter":
                if (KM <= 5000) {
                    earnPerKM = (KM * 1.05) * 4;
                } else if (KM <= 10000) {
                    earnPerKM = (KM * 1.25) * 4;

                }break;
        }
        if (KM > 10000 && KM <= 20000) {
            earnPerKM = (KM * 1.45) * 4;
        }
        System.out.printf("%.2f", earnPerKM * 0.9);
    }
}
