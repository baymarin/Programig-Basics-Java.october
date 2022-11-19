package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class EasterParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guests = Integer.parseInt(scanner.nextLine());
        double priceForAGuest = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double sum = guests * priceForAGuest;
        if (guests >= 10 && guests <=15){
            sum = sum * 0.85;
        }else if (guests >= 15 && guests <= 20){
            sum = sum * 0.8;
        }else if (guests > 20){
            sum = sum * 0.75;
        }
        double cake = budget * 0.1;
        if (budget >= (cake + sum)){
            System.out.printf("It is party time! %.2f leva left.", budget - (cake + sum));
        }else {
            double diff = Math.abs(budget - (cake + sum));
            System.out.printf("No party! %.2f leva needed.", diff);
            }
        }
    }
