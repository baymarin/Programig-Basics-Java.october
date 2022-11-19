package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class TravelAgency_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String consumables = scanner.nextLine();
        String VIP = scanner.nextLine();
        int daysStay = Integer.parseInt(scanner.nextLine());

        double pricePerDay = 0;
        double totalPriceStay = 0;
        if (!town.equals("Bansko") && !town.equals("Borovets") && !town.equals("Varna")
                && !town.equals("Burgas") || !consumables.equals("noEquipment") && !consumables.equals("withEquipment")
                && !consumables.equals("noBreakfast") && !consumables.equals("withBreakfast")){
            System.out.println("Invalid input!");
            return;
        }

        if (daysStay < 1) {
            System.out.println("Days must be positive number!");
            return;
        }
        switch (town) {
            case "Bansko":
            case "Borovets":
                switch (consumables) {
                    case "withEquipment":
                        pricePerDay = 100;
                        switch (VIP) {
                            case "yes":
                                pricePerDay *= 0.9;
                                break;
                        }break;
                    case "noEquipment":
                        pricePerDay = 80;
                        switch (VIP) {
                            case "yes":
                                pricePerDay *= 0.95;
                                break;
                        }break;
                }
                break;
            case "Varna":
            case "Burgas":
                switch (consumables) {
                    case "withBreakfast":
                        pricePerDay = 130;
                        switch (VIP) {
                            case "yes":
                                pricePerDay *= 0.88;
                                break;
                        }break;
                    case "noBreakfast":
                        pricePerDay = 100;
                        switch (VIP) {
                            case "yes":
                                pricePerDay *= 0.93;
                                break;
                        }break;
                }
                break;
        }
        if (daysStay > 7) {
            totalPriceStay = (daysStay * pricePerDay) - pricePerDay;
        } else {
            totalPriceStay = daysStay * pricePerDay;
        }
        System.out.printf("The price is %.2flv! Have a nice time!", totalPriceStay);
    }
}
