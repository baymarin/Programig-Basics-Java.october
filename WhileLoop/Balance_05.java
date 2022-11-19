package FirstStepsInCoding.WhileLoop;

import java.util.Scanner;

public class Balance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        double allNum = 0;
        while (!text.equals("NoMoreMoney")){
            double sum = Double.parseDouble(text);
            if (sum <= 0){
                System.out.println("Invalid operation!");
                break;
            }
            allNum += sum ;
            System.out.printf("Increase: %.2f%n", sum);
            text = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", allNum);
    }
}
