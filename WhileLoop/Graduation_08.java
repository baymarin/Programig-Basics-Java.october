package FirstStepsInCoding.WhileLoop;
import java.util.Scanner;
public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int goodGrade = 1;
        int badGrade = 0;
        double allGrade = 0;
        boolean isExcluded = false;
        while (goodGrade <= 12) {
            if (badGrade == 2) {
                isExcluded = true;
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                badGrade++;
                continue;
            }
            goodGrade++;
            allGrade +=grade;
        }
        if (isExcluded){
            System.out.printf("%s has been excluded at %d grade", name, goodGrade );
        }else {
            System.out.printf("%s graduated. Average grade: %.2f", name, allGrade / 12);
        }
    }
}
