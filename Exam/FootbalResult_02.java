package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class FootbalResult_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wins = 0;
        int loses = 0;
        int draws = 0;

        String first = scanner.nextLine();
        char homeGoalsFirst = first.charAt(0);
        char enemyGoalsFirst = first.charAt(2);

        String second = scanner.nextLine();
        char homeGoalsSecond = second.charAt(0);
        char enemyGoalsSecond = second.charAt(2);

        String third = scanner.nextLine();
        char homeGoalsThird = third.charAt(0);
        char enemyGoalsThird = third.charAt(2);

        if (homeGoalsFirst > enemyGoalsFirst){
            wins++;
        }if (homeGoalsSecond > enemyGoalsSecond) {
            wins++;
        }if (homeGoalsThird > enemyGoalsThird) {
            wins++;
        }
        if (homeGoalsFirst == enemyGoalsFirst) {
            draws++;
        }if (homeGoalsSecond == enemyGoalsSecond) {
            draws++;
        }if (homeGoalsThird == enemyGoalsThird) {
            draws++;
        }
        if (homeGoalsFirst < enemyGoalsFirst){
            loses ++;
        }if (homeGoalsSecond < enemyGoalsSecond){
            loses ++;
        }if (homeGoalsThird < enemyGoalsThird){
            loses ++;
        }
        System.out.printf("Team won %d games.%n", wins);
        System.out.printf("Team lost %d games.%n", loses);
        System.out.printf("Drawn games: %d", draws);
    }
}
