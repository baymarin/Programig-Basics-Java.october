package FirstStepsInCoding.NestedLoopExcersice;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juryCount = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        double allGrade = 0;
        int counter = 0;
        String namePresentation = "";
        while (!name.equals("Finish")) {
            double singleGrade = 0;
            for (int i = 1; i <= juryCount; i++) {
                double grades = Double.parseDouble(scanner.nextLine());
                singleGrade += grades;
                namePresentation = name;
                allGrade += grades;
                counter ++;
            }
            System.out.printf("%s - %.2f.%n", namePresentation, singleGrade / juryCount);
            name = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allGrade / counter);
    }
}
