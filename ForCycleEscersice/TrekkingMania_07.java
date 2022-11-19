package FirstStepsInCoding.ForCycleEscersice;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int allPeople = 0;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i = 1; i <= n; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            allPeople += peopleInGroup;
            if (peopleInGroup <= 5) {
                p1 += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                p2 += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                p3 += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                p4 += peopleInGroup;
            } else {
                p5 += peopleInGroup;
            }
        }
        double p1percent = 1.0 * p1 / allPeople * 100;
        double p2percent = 1.0 * p2 / allPeople * 100;
        double p3percent = 1.0 * p3 / allPeople * 100;
        double p4percent = 1.0 * p4 / allPeople * 100;
        double p5percent = 1.0 * p5 / allPeople * 100;
        System.out.printf("%.2f%%%n", p1percent);
        System.out.printf("%.2f%%%n", p2percent);
        System.out.printf("%.2f%%%n", p3percent);
        System.out.printf("%.2f%%%n", p4percent);
        System.out.printf("%.2f%%", p5percent);
    }
}
