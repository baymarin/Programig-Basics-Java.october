package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class EasterTrip_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String date = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double price = 0 ;
        switch (country){
            case "France":
                switch (date){
                    case "21-23":
                        price = nights * 30;
                        break;
                    case "24-27":
                        price = nights * 35;
                        break;
                    case "28-31":
                        price = nights * 40;
                        break;
                }break;
            case "Italy":
                switch (date){
                    case "21-23":
                        price = nights * 28;
                        break;
                    case "24-27":
                        price = nights * 32;
                        break;
                    case "28-31":
                        price = nights * 39;
                        break;
                }break;
            case "Germany":
                switch (date){
                    case "21-23":
                        price = nights * 32;
                        break;
                    case "24-27":
                        price = nights * 37;
                        break;
                    case "28-31":
                        price = nights * 43;
                        break;
                }break;
        }
        System.out.printf("Easter trip to %s : %.2f leva.", country, price);
    }
}
