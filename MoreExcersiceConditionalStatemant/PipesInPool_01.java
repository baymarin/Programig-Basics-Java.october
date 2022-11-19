package FirstStepsInCoding.MoreExcersiceConditionalStatemant;

import java.util.Scanner;

public class PipesInPool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poolObem = Integer.parseInt(scanner.nextLine());
        int firstPipe = Integer.parseInt(scanner.nextLine());
        int secondPipe = Integer.parseInt(scanner.nextLine());
        double hoursMissing = Double.parseDouble(scanner.nextLine());

        double firstPipeIN = firstPipe * hoursMissing;
        double secondPipeIN = secondPipe * hoursMissing;
        double waterIN = firstPipeIN + secondPipeIN ;
        if (waterIN <= poolObem) {
            double percentFull = (waterIN / poolObem * 100);
            double firstPipePercent = (firstPipeIN  / waterIN * 100);
            double secondPipePercent = (secondPipeIN / waterIN * 100 );
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%% Pipe 2: %.2f%%", percentFull , firstPipePercent, secondPipePercent);
        }else if (waterIN > poolObem){
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hoursMissing , (waterIN - poolObem));
        }
    }
}
