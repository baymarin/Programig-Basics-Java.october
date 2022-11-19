package FirstStepsInCoding.Exam;

import java.util.Scanner;

public class SuitcaseLoad_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        int suitcase = 0;
        double sumLoad = 0;
        while (!command.equals("End")) {
            double load = Double.parseDouble(command);
            suitcase++;
            if (suitcase % 3 == 0){
                load *= 1.1;
            }
            sumLoad += load;
            capacity -= load;
            if (capacity < 0 ){
                suitcase -= 1;
                System.out.println("No more space!");
                System.out.printf("Statistic: %d suitcases loaded.", suitcase);
                break;
            }

            command = scanner.nextLine();
        }
        if (command.equals("End")){
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.", suitcase);
        }
    }
}
