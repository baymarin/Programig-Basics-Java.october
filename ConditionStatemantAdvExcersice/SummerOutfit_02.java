package FirstStepsInCoding.ConditionStatemantAdvExcersice;

import java.util.Scanner;

public class SummerOutfit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        if (time.equals("Morning")) {
            if (degrees >= 10 && degrees <= 18) {
                System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", degrees);
            } else if (degrees > 18 && degrees <= 24) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.",degrees);
            } else if (degrees >= 25) {
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.",degrees);
            }
        } else if (time.equals("Afternoon")) {
            if (degrees >= 10 && degrees <= 18) {
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
            }else if (degrees > 18 && degrees <= 24){
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degrees);
            }else if (degrees >= 24){
                System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.",degrees);
            }
        }else if (time.equals("Evening")){
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
            }
        }
    }
