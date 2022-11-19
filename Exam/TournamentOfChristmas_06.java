package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class TournamentOfChristmas_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysTournament = Integer.parseInt(scanner.nextLine());
        double sumMoney = 0;
        int totalWins = 0;
        int totalLoses = 0;
        for (int i = 1; i <= daysTournament; i++) {
            String command = scanner.nextLine();
            double moneyWon = 0;
            int wins = 0;
            int loses = 0;
            while (!command.equals("Finish")) {
                String score = scanner.nextLine();
                switch (score) {
                    case "win":
                        moneyWon += 20;
                        totalWins++;
                        wins ++;
                        break;
                    case "lose":
                        totalLoses++;
                        loses ++;
                        break;
                }
                command = scanner.nextLine();

            }
            if (wins > loses) {
                moneyWon *= 1.1;
            }
            sumMoney += moneyWon;

        }
        if (totalWins > totalLoses){
            sumMoney *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", sumMoney);
        }else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", sumMoney);
        }
    }
}

