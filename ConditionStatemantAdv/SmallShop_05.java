package FirstStepsInCoding.ConditionStatemantAdv;

import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (town.equals("Sofia")) {
            switch (product) {
                case "coffee":
                    System.out.println(quantity * 0.50);
                    break;
                case "water":
                    System.out.println(quantity * 0.80);
                    break;
                case "beer":
                    System.out.println(quantity * 1.20);
                    break;
                case "sweets":
                    System.out.println(quantity * 1.45);
                    break;
                case "peanuts":
                    System.out.println(quantity * 1.60);
                    break;
            }
        }else if (town.equals("Plovdiv")){
            switch (product){
                case "coffee":
                    System.out.println(quantity * 0.40);
                    break;
                case "water":
                    System.out.println(quantity * 0.70);
                    break;
                case "beer":
                    System.out.println(quantity * 1.15);
                    break;
                case "sweets":
                    System.out.println(quantity * 1.30);
                    break;
                case "peanuts":
                    System.out.println(quantity * 1.50);
                    break;
            }
        }else if (town.equals("Varna")){
            switch (product){
                case "coffee" :
                    System.out.println(quantity * 0.45);
                    break;
                case "water" :
                    System.out.println(quantity * 0.70);
                    break;
                case "beer":
                    System.out.println(quantity * 1.10);
                    break;
                case "sweets":
                    System.out.println(quantity * 1.35);
                    break;
                case "peanuts":
                    System.out.println(quantity * 1.55);
                    break;
            }
        }

    }
}

