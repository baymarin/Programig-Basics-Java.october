package FirstStepsInCoding.IfElseExcercise;

import java.util.Scanner;

public class WorldRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distanceMeter = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double delay = Math.floor((distanceMeter / 15 )) * 12.5 ;
        double result = (distanceMeter * timeForOneMeter) + delay ;

        if (result < worldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", result);
        } else
            System.out.printf("No, he failed! He was %.2f seconds slower.", result - worldRecord);

    }
}
