package FirstStepsInCoding.MoreExcersiceConditionalAADV;

import java.util.Scanner;

public class RentACar_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String clas = "";
        String type = "";
        double price = 0;
        if (budget <= 100) {
            clas = "Economy class";
            if (season.equals("Summer")) {
                type = "Cabrio";
                price = budget * 0.35;
            } else if (season.equals("Winter")) {
                type = "Jeep";
                price = budget * 0.65;
            }
        } else if (budget <= 500) {
            clas = "Compact class";
            if (season.equals("Summer")){
                type = "Cabrio";
                price = budget * 0.45;
            }else if (season.equals("Winter")){
                type = "Jeep";
                price = budget * 0.8;
            }
        }else {
            clas = "Luxury class";
            type = "Jeep";
            price = budget * 0.9;
        }
        System.out.printf("%s%n", clas);
        System.out.printf("%s - %.2f", type , price);
    }
}
