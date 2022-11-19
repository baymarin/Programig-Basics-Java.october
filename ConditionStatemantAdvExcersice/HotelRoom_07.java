package FirstStepsInCoding.ConditionStatemantAdvExcersice;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0;
        double priceApartment = 0;
        switch (month) {
            case "May":
            case "October":
                priceStudio = nights * 50;
                priceApartment = nights * 65;
                if (nights > 7 && nights <= 14) {
                    priceStudio = priceStudio * 0.95;
                }else if (nights > 14 ){
                    priceStudio = priceStudio * 0.70;
                }break;
            case "June":
            case "September":
                priceStudio = nights * 75.20;
                priceApartment = nights * 68.70;
                if (nights > 14){
                    priceStudio = priceStudio * 0.80;
                }break;
            case "July":
            case "August":
                priceStudio = nights * 76;
                priceApartment = nights * 77;
                break;
        }if (nights > 14){
            priceApartment = priceApartment * 0.90;
        }
        System.out.printf("Apartment: %.2f lv.%n", priceApartment);
        System.out.printf("Studio: %.2f lv. %n", priceStudio);
    }
}
