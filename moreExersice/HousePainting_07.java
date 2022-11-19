package FirstStepsInCoding.moreExersice;

import java.util.Scanner;

public class HousePainting_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double heightWall = Double.parseDouble(scanner.nextLine());
        double wightWall = Double.parseDouble(scanner.nextLine());
        double heightCeiling = Double.parseDouble(scanner.nextLine());

        double areaWall = heightWall * wightWall ;
        double windows = 1.5 * 1.5 ;
        double freeWallSpace = areaWall * 2 - windows * 2 ;
        double backWall = heightWall * heightWall ;
        double frontWall = backWall - (1.2 * 2 );
        double freeFrontSpace = backWall + frontWall ;
        double greenPaint = (freeFrontSpace + freeWallSpace) / 3.4 ;

        double ceilingWall = (heightWall * wightWall) * 2 ;
        double ceilingFront = 2 * (heightWall * heightCeiling / 2) ;
        double ceilingWholeArea = ceilingFront + ceilingWall ;
        double redPaint = ceilingWholeArea / 4.3 ;

        System.out.printf("%.2f%n", greenPaint);
        System.out.printf("%.2f%n", redPaint);

    }
}
