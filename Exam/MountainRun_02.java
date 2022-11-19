package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class MountainRun_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecForMeter = Double.parseDouble(scanner.nextLine());
        double delay = Math.floor(distanceInMeters / 50) ;
        double delaySec = delay * 30 ;
        double hisTimeInSec = (timeInSecForMeter * distanceInMeters) + delaySec ;
        if (hisTimeInSec < recordInSec){
            System.out.printf("Yes! The new record is %.2f seconds.", hisTimeInSec);
        }else {
            double diff = Math.abs(hisTimeInSec - recordInSec);
            System.out.printf("No! He was %.2f seconds slower.", diff);
        }

    }
}
