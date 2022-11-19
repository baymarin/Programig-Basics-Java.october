package FirstStepsInCoding.MoreExcersiceConditionalStatemant;

import java.util.Scanner;

public class FlowerShop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolii = Integer.parseInt(scanner.nextLine());
        int ziumbuil = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());
        double income = (magnolii * 3.25) + (ziumbuil * 4) + (roses * 3.5) + (cactus * 8);
        double afterTax = income - (income * 0.05);
        double leftover = Math.abs(giftPrice - afterTax);

        if (giftPrice <= income){
            System.out.printf("She is left with %.0f leva.",Math.floor(leftover));
        }else {
            System.out.printf("She will have to borrow %.0f leva.",Math.ceil(leftover));
        }
    }
}
