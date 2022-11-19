package FirstStepsInCoding.WhileLoopMoreExc;

import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soap = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int amountSoapML = soap * 750;
        int plates = 0;
        int pots = 0;
        int i = 0;
        int usedSoap = 0;
        while (!command.equals("End")) {
            int dishes = Integer.parseInt(command);
            i++;
            if (i % 3 == 0) {
                pots += dishes;
                usedSoap += dishes * 15;
                amountSoapML -= dishes * 15;
            }
            if (i % 3 != 0) {
                plates += dishes;
                usedSoap += dishes * 5;
                amountSoapML -= dishes * 5;
            }
            if (amountSoapML < 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(amountSoapML));
                break;
            }
            command = scanner.nextLine();
        }
        if (usedSoap <= amountSoapML || command.equals("End")) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", plates, pots);
            System.out.printf("Leftover detergent %d ml.", amountSoapML );
        }
    }
}
