package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class AgencyProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameCompany = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int childTickets = Integer.parseInt(scanner.nextLine());
        double priceAdult = Double.parseDouble(scanner.nextLine());
        double fee = Double.parseDouble(scanner.nextLine());
        double priceChildTicket = childTickets * (priceAdult * 0.3);
        double priceAdultTicket = adultTickets * priceAdult;
        double taxFee = (adultTickets + childTickets ) * fee ;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", nameCompany, (priceAdultTicket + priceChildTicket + taxFee) * 0.2);
    }
}
