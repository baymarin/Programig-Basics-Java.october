package FirstStepsInCoding.exerscise;

import java.util.Scanner;

public class DeliveryFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chicken * 10.35 ;
        double fishPrice = fish * 12.40 ;
        double veganPrice = vegan * 8.15 ;
        double wholePrice = chickenPrice + fishPrice + veganPrice ;
        double desert =   0.2 * wholePrice;
        double properPrice = wholePrice + desert + 2.50 ;

        System.out.println(properPrice);
    }
}
