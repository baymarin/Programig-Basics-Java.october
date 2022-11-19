package FirstStepsInCoding.ConditionStatemantAdvExcersice;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;
        String destination = "";
        String accommodation = "";
            if (budget <= 100){
                destination = "Bulgaria";
                switch (season){
                    case "summer":
                        accommodation = "Camp";
                        price = budget * 0.3;
                        break;
                    case "winter":
                        accommodation = "Hotel";
                        price = budget * 0.7;
                        break;
                }
            }else if (budget <= 1000){
                destination = "Balkans";
                switch (season){
                    case "summer":
                        accommodation = "Camp";
                        price = budget * 0.4;
                        break;
                    case "winter":
                        accommodation = "Hotel";
                        price = budget * 0.8;
                        break;
                }
            }else {
                destination = "Europe";
                accommodation = "Hotel";
                price = budget * 0.9;
            }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", accommodation, price);
    }
}
