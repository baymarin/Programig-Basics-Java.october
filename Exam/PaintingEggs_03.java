package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class PaintingEggs_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (size){
            case "Large":
                switch (color){
                    case "Red":
                        price = 16 * amount;
                        break;
                    case "Green":
                        price = 12 * amount;
                        break;
                    case "Yellow":
                        price = 9 * amount;
                        break;
                }break;
            case "Medium":
                switch (color){
                    case  "Red":
                        price = 13 * amount;
                        break;
                    case "Green":
                        price = 9 * amount;
                        break;
                    case "Yellow":
                        price = 7 * amount;
                        break;
                }break;
            case "Small":
                switch (color){
                    case "Red":
                        price = 9 * amount;
                        break;
                    case "Green":
                        price = 8 * amount;
                        break;
                    case "Yellow":
                        price = 5 * amount;
                        break;
                }break;
        }
        System.out.printf("%.2f leva.", price * 0.65);
    }
}
