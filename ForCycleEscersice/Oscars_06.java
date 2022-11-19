package FirstStepsInCoding.ForCycleEscersice;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameActor = scanner.nextLine();
        double pointFromAcademy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double neededScore = 1250.5;
        double sumAllPoints = pointFromAcademy;


        for (int i = 1; i <= n; i++) {
            String nameJudge = scanner.nextLine();
            double gradeJudge = Double.parseDouble(scanner.nextLine());

            double currentPoint = (nameJudge.length() * gradeJudge) / 2;
            sumAllPoints += currentPoint;
            if (sumAllPoints >= neededScore) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor,sumAllPoints);
                break;
            }
        }
        double diff = Math.abs(sumAllPoints - neededScore);
        if (sumAllPoints < neededScore) {

            System.out.printf("Sorry, %s you need %.1f more!", nameActor, diff);
        }
    }
}
