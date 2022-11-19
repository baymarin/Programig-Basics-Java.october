package FirstStepsInCoding.ConditionStatemantAdvExcersice;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysStay = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String grade = scanner.nextLine();

        double price = 0;
        switch (type){
            case "room for one person":
                price = (daysStay * 18.00) - 18.00;
                break;
            case "apartment":
                price = (daysStay * 25.00) - 25.00;
                if (daysStay < 10){
                    price = price - (price * 0.3);
                }else if (daysStay > 10 && daysStay < 15){
                    price = price - (price * 0.35);
                }else {
                    price =  price - (price * 0.5);
                }break;
            case "president apartment":
                price = (daysStay * 35.00) - 35.00;
                if (daysStay < 10 ){
                    price = price - (price * 0.1);
                }else if (daysStay > 10 && daysStay < 15){
                    price = price - (price * 0.15);
                }else {
                    price = price - (price * 0.20);
                }break;
        }if (grade.equals("positive")){
            price = price + (price * 0.25);
        }else if (grade.equals("negative")){
            price = price * 0.9;
        }
        System.out.printf("%.2f", price);
    }
}
