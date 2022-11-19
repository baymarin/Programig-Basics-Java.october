package FirstStepsInCoding.exerscise;

import java.util.Scanner;

public class usdToLv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double USD = Double.parseDouble(scanner.nextLine());
        Double BGN = USD * 1.79549 ;

        System.out.println(BGN);
    }
}
