package FirstStepsInCoding.ExamPrep;

import java.util.Scanner;

public class forth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double totalAmount = 0;
        double totalDegree = 0;
        for (int i = 1; i <= n; i++) {
            double amount = Double.parseDouble(scanner.nextLine());
            double degree = Double.parseDouble(scanner.nextLine());
            double degreePerLiter = amount * degree;
            totalAmount += amount;
            totalDegree += degreePerLiter;
        }
        double endDegree = totalDegree / totalAmount;
        System.out.printf("Liter: %.2f%n", totalAmount);
        System.out.printf("Degrees: %.2f%n", endDegree);
        if (endDegree < 38){
            System.out.println("Not good, you should baking!");
        }else if (endDegree < 42){
            System.out.println("Super!");
        }else {
            System.out.println("Dilution with distilled water!");
        }
    }
}
