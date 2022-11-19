package FirstStepsInCoding.exerscise;

import java.util.Scanner;

public class BasketStuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearTax = Integer.parseInt(scanner.nextLine());

        double shoes = yearTax - (yearTax * 0.4);
        double ekip = shoes - (shoes * 0.2);
        double ball = ekip / 4 ;
        double accsesoaries = ball / 5 ;
        double wholePrice =  yearTax + shoes + ekip + ball + accsesoaries ;

        System.out.println(wholePrice);
        }

    }

