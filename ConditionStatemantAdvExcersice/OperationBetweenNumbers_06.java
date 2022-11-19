package FirstStepsInCoding.ConditionStatemantAdvExcersice;

import java.util.Scanner;

public class OperationBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        int result = 0 ;
        switch (symbol) {
            case "+":
                result = num + num2;
                if (result % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", num, num2, result);
                } else {
                    System.out.printf("%d + %d = %d - odd", num, num2, result);
                }break;
            case "-":
                result = num - num2;
                if (result % 2 == 0){
                    System.out.printf("%d - %d = %d - even",num ,num2, result);
                }else {
                    System.out.printf("%d - %d = %d - odd", num, num2, result);
                }break;
            case "*":
                result = num * num2;
                if (result % 2 == 0 ){
                    System.out.printf("%d * %d = %d - even",num, num2, result);
                }else {
                    System.out.printf("%d * %d = %d - odd", num, num2, result);
                }break;
            case "/":
                if (num2 == 0){
                    System.out.printf("Cannot divide %d by zero", num);
                }else {
                    double divide = num * 1.0 / num2 ;
                    System.out.printf("%d / %d = %.2f", num , num2, divide);
                }break;
            case "%":
                if ( num2 == 0){
                    System.out.printf("Cannot divide %d by zero", num);
                }else {
                    double percent = num % num2;
                    System.out.printf("%d %% %d = %.0f", num, num2, percent);
                }break;
            }
        }
    }
