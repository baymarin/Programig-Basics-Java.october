package FirstStepsInCoding.Exam;
import java.util.Scanner;

public class Safari_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double fuelNeeded = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();
        double priceForFuel = fuelNeeded * 2.10;
        double sum = priceForFuel + 100;
        switch (dayOfWeek){
            case "Saturday":
                sum *= 0.9;
                break;
            case "Sunday":
                sum *= 0.8;
                break;
        }
        if (budget >= sum){
            System.out.printf("Safari time! Money left: %.2f lv.", budget - sum);
        }else {
            double diff = Math.abs(budget - sum);
            System.out.printf("Not enough money! Money needed: %.2f lv.", diff);
        }
    }
}
