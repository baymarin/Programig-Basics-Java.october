package FirstStepsInCoding.Exam;
import java.util.Scanner;

public class EasternEggs_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = Integer.parseInt(scanner.nextLine());
        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int best = Integer.MIN_VALUE;
        String bestColor = "";
        for (int i = 1; i <= amount; i++) {
            String color = scanner.nextLine();
            switch (color) {
                case "red":
                    red++;
                    break;
                case "orange":
                    orange++;
                    break;
                case "blue":
                    blue++;
                    break;
                case "green":
                    green++;
                    break;
            }

        }
        if (red > best){
            best = red;
            bestColor = "red";
        }if (orange > best){
            best = orange;
            bestColor = "orange";
        }if (blue > best){
            best = blue;
            bestColor = "blue";
        }if (green > best){
            best = green;
            bestColor = "green";
        }
        System.out.printf("Red eggs: %d%n", red);
        System.out.printf("Orange eggs: %d%n", orange);
        System.out.printf("Blue eggs: %d%n", blue);
        System.out.printf("Green eggs: %d%n", green);
        System.out.printf("Max eggs: %d -> %s", best, bestColor);
    }
}
