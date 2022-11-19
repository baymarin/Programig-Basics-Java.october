package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class EasternCompetition_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtyCakes = Integer.parseInt(scanner.nextLine());
        int numberOne = Integer.MIN_VALUE;
        String bestName = "";
        for (int i = 1; i <= qtyCakes ; i++) {
            String nameBaker = scanner.nextLine();
            int bakerPoints = 0;
            String command = scanner.nextLine();

            while (!command.equals("Stop")){
                int grade = Integer.parseInt(command);
                bakerPoints += grade;

            command = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", nameBaker,bakerPoints);
            if (bakerPoints > numberOne){
                numberOne = bakerPoints;
                bestName = nameBaker;
                System.out.printf("%s is the new number 1!%n", nameBaker);
            }
        }
        System.out.printf("%s won competition with %d points!", bestName, numberOne);
    }
}
