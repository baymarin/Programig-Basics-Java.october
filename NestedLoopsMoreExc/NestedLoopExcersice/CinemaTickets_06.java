package FirstStepsInCoding.NestedLoopExcersice;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameMoovie = scanner.nextLine();
        int studentTickets = 0;
        int standardTickets = 0;
        int kidsTickets = 0;

        while (!nameMoovie.equals("Finish")) {
            int freeSpace = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int totalTickets = 0;
            int amountTickets = 0;
            String name = nameMoovie;
            while (!ticketType.equals("End")) {
                switch (ticketType) {
                    case "student":
                        studentTickets++;
                        totalTickets++;
                        amountTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        totalTickets++;
                        amountTickets++;
                        break;
                    case "kid":
                        kidsTickets++;
                        totalTickets++;
                        amountTickets++;
                        break;
                }
                if (amountTickets >= freeSpace){
                    break;
                }
                ticketType = scanner.nextLine();
            }
            double mooviePercent = (1.0 * totalTickets / freeSpace) * 100;
            System.out.printf("%s - %.2f%% full.%n", name, mooviePercent);
            nameMoovie = scanner.nextLine();
        }
        int ticketSum = kidsTickets + standardTickets + studentTickets;
        System.out.printf("Total tickets: %d%n", ticketSum);
        System.out.printf("%.2f%% student tickets.%n", (1.0 * studentTickets / ticketSum) * 100);
        System.out.printf("%.2f%% standard tickets.%n", (1.0 * standardTickets / ticketSum) * 100);
        System.out.printf("%.2f%% kids tickets.", (1.0 * kidsTickets / ticketSum) * 100);

    }
}
