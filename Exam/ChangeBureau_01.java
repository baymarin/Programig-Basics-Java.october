package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class ChangeBureau_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chinese = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());
        double bitcoinLV = bitcoin * 1168;
        double chineseLV = (chinese * 0.15) * 1.76;
        double euro = (bitcoinLV + chineseLV) / 1.95;
        double commissionPercent = commission * 0.01;
        System.out.printf("%.2f",euro -( euro * commissionPercent ));
    }
}
