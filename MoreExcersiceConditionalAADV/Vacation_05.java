package FirstStepsInCoding.MoreExcersiceConditionalAADV;

import java.util.Scanner;

public class Vacation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = "";
        String accommodation = "";
        double price = 0;
        if (budget <= 1000) {
            accommodation = "Camp";
            if (season.equals("Summer")) {
                price = budget * 0.65;
            } else if (season.equals("Winter")) {
                price = budget * 0.45;
            }
        } else if (budget <= 3000) {
            accommodation = "Hut";
            if (season.equals("Summer")) {
                price = budget * 0.8;
            } else if (season.equals("Winter")) {
                price = budget * 0.6;
            }
        } else {
            accommodation = "Hotel";
            price = budget * 0.9;
        }
        if (season.equals("Summer")){
            location = "Alaska";
        }else if (season.equals("Winter")){
            location = "Morocco";
        }
        System.out.printf("%s - %s - %.2f", location, accommodation, price);
    }
}
