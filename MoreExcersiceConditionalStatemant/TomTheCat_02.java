package FirstStepsInCoding.MoreExcersiceConditionalStatemant;

import java.util.Scanner;

public class TomTheCat_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int daysOff = Integer.parseInt(scanner.nextLine());
        int workingDays = 365 - daysOff;
        int playingTime = workingDays * 63 + daysOff * 127;
        int timeOver = Math.abs(playingTime - 30000);

        if (playingTime >= 30000){
            int hours = timeOver / 60;
            int minutes = timeOver % 60;
            System.out.printf("Tom will run away%n");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        } else {

            int hours = timeOver / 60;
            int minutes = timeOver % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }
    }
}
