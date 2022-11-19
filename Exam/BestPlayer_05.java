package FirstStepsInCoding.Exam;
import java.util.Scanner;

public class BestPlayer_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int mostGoals = Integer.MIN_VALUE;
        String bestPlayer = "";
        while (!name.equals("END")){
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > mostGoals){
                mostGoals = goals;
                bestPlayer = name;
            }
            if (mostGoals >= 10){
                break;
            }
        name = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (mostGoals >= 3 ){
            System.out.printf("He has scored %d goals and made a hat-trick !!!", mostGoals);
        }else {
            System.out.printf("He has scored %d goals.", mostGoals);
        }
    }
}
