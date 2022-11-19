    package FirstStepsInCoding.IfElseExcercise;

    import java.util.Scanner;

    public class LunchBreak_08 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String name = scanner.nextLine();
            int episodeLong = Integer.parseInt(scanner.nextLine());
            int lunchBreak = Integer.parseInt(scanner.nextLine());

            double timeForLunch = lunchBreak / 8.0 ;
            double timeForChill = lunchBreak / 4.0 ;
            double timeLeft = lunchBreak - timeForLunch - timeForChill ;

            if (timeLeft >= episodeLong){
                System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(timeLeft - episodeLong));
            }else
                System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(episodeLong - timeLeft));
        }
    }
