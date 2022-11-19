package FirstStepsInCoding.exerscise;

import java.util.Scanner;

public class VacationBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountPages = Integer.parseInt(scanner.nextLine());
        int pagesPerH = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int totalReadTime = amountPages / pagesPerH ;
        int neededHours = totalReadTime / days ;

        System.out.println(neededHours);
    }
}
