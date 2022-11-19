package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class AddBags_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOver20KG = Double.parseDouble(scanner.nextLine());
        double kilogramsBags = Double.parseDouble(scanner.nextLine());
        int daysUnTillTravel = Integer.parseInt(scanner.nextLine());
        int amountBags = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (kilogramsBags < 10){
            price = priceOver20KG * 0.2;
        }else if (kilogramsBags <= 20){
            price = priceOver20KG * 0.5;
        }else {
            price = priceOver20KG;
        }
        if (daysUnTillTravel < 7){
            price = price * 1.4;
        }else if (daysUnTillTravel <= 30){
            price = price * 1.15;
        }else {
            price = price * 1.1;
        }
        System.out.printf("The total price of bags is: %.2f lv. ", price * amountBags);
    }
}
