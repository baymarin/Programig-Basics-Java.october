package FirstStepsInCoding.MoreExcersiceConditionalAADV;

import java.util.Scanner;

public class BikeRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int youngRacer = Integer.parseInt(scanner.nextLine());
        int oldRacer = Integer.parseInt(scanner.nextLine());
        String trail = scanner.nextLine();
        double moneyYoung = 0;
        double moneyOld = 0;
        if (trail.equals("trail")) {
            moneyYoung = youngRacer * 5.50;
            moneyOld = oldRacer * 7;
        } else if (trail.equals("cross-country")) {
            moneyYoung = youngRacer * 8;
            moneyOld = oldRacer * 9.50;
            if (youngRacer + oldRacer >= 50) {
                moneyYoung = moneyYoung * 0.75;
                moneyOld = moneyOld * 0.75;
            }
        } else if (trail.equals("downhill")) {
            moneyYoung = youngRacer * 12.25;
            moneyOld = oldRacer * 13.75;
        } else if (trail.equals("road")) {
            moneyYoung = youngRacer * 20;
            moneyOld = oldRacer * 21.50;
        }
        double general = (moneyOld + moneyYoung);
        double afterTax = general * 0.95;
        System.out.printf("%.2f",afterTax);
    }
}

