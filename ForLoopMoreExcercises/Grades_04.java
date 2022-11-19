package FirstStepsInCoding.ForLoopMoreExcercises;

import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int failStudents = 0;
        int almostFail = 0;
        int midStudents = 0;
        int topStudents = 0;
        double averageGrade = 0;
        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 2 && grade <= 2.99) {
                failStudents++;
                averageGrade += grade;
            } else if (grade < 4) {
                almostFail++;
                averageGrade += grade;
            } else if (grade < 5) {
                midStudents++;
                averageGrade += grade;
            } else {
                topStudents++;
                averageGrade += grade;
            }
        }
        double averageGradePercent = averageGrade / students ;
        double failStudentsPercent = (1.0 * failStudents / students) * 100;
        double almostFailPercent = (1.0 * almostFail / students) * 100;
        double midStudentsPercent = (1.0 * midStudents / students) * 100;
        double topGradePercent = (1.0 * topStudents / students) * 100;

        System.out.printf("Top students: %.2f%%%n", topGradePercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", midStudentsPercent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", almostFailPercent);
        System.out.printf("Fail: %.2f%%%n", failStudentsPercent );
        System.out.printf("Average: %.2f", averageGradePercent);

    }
}
