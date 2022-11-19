package FirstStepsInCoding.IfElseExcercise;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double sumVideo = videoCard * 250.0 ;
        double sumProcessor = (sumVideo * 0.35) * processor;
        double sumRam = (sumVideo * 0.10) * ram  ;
        double wholePrice = sumProcessor + sumRam + sumVideo ;

        if (videoCard > processor){
            wholePrice = wholePrice * 0.85 ;
        }
        if (wholePrice <= budget){
            System.out.printf("You have %.2f leva left!", budget - wholePrice);
        } else
            System.out.printf("Not enough money! You need %.2f leva more!", wholePrice - budget);
    }
}
