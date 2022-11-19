package FirstStepsInCoding.MoreExcersiceConditionalStatemant;

import java.util.Scanner;

public class GasTank_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuel = scanner.nextLine();
        int amountFuel = Integer.parseInt(scanner.nextLine());
        switch (fuel){
            case "Diesel":
                if (amountFuel >= 25){
                    System.out.print("You have enough diesel.");
                }else {
                    System.out.print("Fill your tank with diesel!");
                }
                break;
            case "Gasoline":
                if (amountFuel >= 25){
                    System.out.print("You have enough gasoline.");
                }else {
                    System.out.print("Fill your tank with gasoline!");
                }
                break;
            case "Gas":
                if (amountFuel >= 25){
                    System.out.print("You have enough gas.");
                }else {
                    System.out.print("Fill your tank with gas!");
                }
                break;
            default:
                System.out.print("Invalid fuel!");
                break;
        }

    }
}
