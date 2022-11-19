package FirstStepsInCoding.MoreExcersiceConditionalStatemant;

import java.io.PrintStream;
import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int KM = Integer.parseInt(scanner.nextLine());
        String timeFromTheDay = scanner.nextLine();
        double price = 0;

        if (KM < 20){
            switch (timeFromTheDay){
                case "day":
                    price = (KM * 0.79) + 0.70;
                    break;
                case "night":
                    price = (KM * 0.90) + 0.70;
                    break;
            }
        }else if (KM >= 20 && KM < 100){
            price = KM * 0.09;
        }else if (KM >= 100){
            price = KM * 0.06;
        }
        System.out.printf("%.2f", price);
    }
}

