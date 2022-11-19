package FirstStepsInCoding.ConditionStatemantAdvExcersice;

import java.util.Scanner;

public class OnTimeForExam2_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minutesArrival = Integer.parseInt(scanner.nextLine());

        int totalMinExam = (hourExam * 60) + minutesExam;
        int totalMinArrival = (hourArrival * 60) + minutesArrival;
        int difference = Math.abs(totalMinArrival - totalMinExam);

        if (totalMinArrival > totalMinExam) {
            System.out.println("Late");
            if (difference < 60) {
                System.out.printf("%d minutes after the start", difference);
            } else {
                int hour = difference / 60;
                int minutes = difference % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }

        } else if (difference <= 30) {
            System.out.println("On time");

            if (totalMinArrival != totalMinExam) {
                System.out.printf("%d minutes before the start", difference);
            }
        } else {
            System.out.println("Early");
            int hour = difference / 60;
            int minutes = difference % 60;

            if (difference < 60) {
                System.out.printf("%d minutes before the start", difference);
            } else {
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            }
        }
    }
}