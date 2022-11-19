package FirstStepsInCoding.MoreExcersiceConditionalAADV;


import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String typeBoysOrGirls = scanner.nextLine();
        int qtyStudents = Integer.parseInt(scanner.nextLine());
        int qtyNights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = 0;
        String sport = "";
        switch (typeBoysOrGirls) {
            case "boys":
            case "girls":
                switch (season) {
                    case "Winter":
                        pricePerNight = (9.60 * qtyNights) * qtyStudents;
                        break;
                    case "Spring":
                        pricePerNight =( 7.20 * qtyNights) * qtyStudents;
                        break;
                    case "Summer":
                        pricePerNight = (15 * qtyNights) * qtyStudents;
                        break;
                }
                break;
            case "mixed":
                switch (season) {
                    case "Winter":
                        pricePerNight = (10 * qtyNights) * qtyStudents;
                        break;
                    case "Spring":
                        pricePerNight =( 9.50 * qtyNights) * qtyStudents;
                        break;
                    case "Summer":
                        pricePerNight = (20 * qtyNights) * qtyStudents;
                        break;
                }
                break;
        }
        if (qtyStudents >= 10 && qtyStudents < 20) {
            pricePerNight = pricePerNight * 0.95;
        } else if (qtyStudents >= 20 && qtyStudents < 50) {
            pricePerNight = pricePerNight * 0.85;
        } else if (qtyStudents >= 50) {
            pricePerNight = pricePerNight * 0.5;
        }
        switch (typeBoysOrGirls) {
            case "girls":
                switch (season) {
                    case "Winter":
                        sport = "Gymnastics";
                        break;
                    case "Spring":
                        sport = "Athletics";
                        break;
                    case "Summer":
                        sport = "Volleyball";
                        break;
                }
                break;
            case "boys":
                switch (season) {
                    case "Winter":
                        sport = "Judo";
                        break;
                    case "Spring":
                        sport = "Tennis";
                        break;
                    case "Summer":
                        sport = "Football";
                        break;
                }
                break;
            case "mixed":
                switch (season) {
                    case "Winter":
                        sport = "Ski";
                        break;
                    case "Spring":
                        sport = "Cycling";
                        break;
                    case "Summer":
                        sport = "Swimming";
                        break;
                }
                break;
        }
        System.out.printf("%s %.2f lv.", sport, pricePerNight);
    }
}

