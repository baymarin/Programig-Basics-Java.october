package FirstStepsInCoding.exerscise;

import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int wide = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double area = length * wide * high ;
        double areaLiters = area * 0.001 ;
        double takenArea = percent * 0.01 ;
        double neededLiters = areaLiters * (1 - takenArea ) ;

        System.out.println(neededLiters);
        }

    }

