    package FirstStepsInCoding.Exam;

    import java.util.Scanner;

    public class EasterGuests_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double guest = Integer.parseInt(scanner.nextLine());
            int budget = Integer.parseInt(scanner.nextLine());
            double kozunaci = Math.ceil(guest / 3) ;
            double eggs = (guest * 2);
            double sum = (eggs * 0.45) + (kozunaci * 4) ;
            if (budget >= sum){
                System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n", kozunaci, eggs);
                System.out.printf("He has %.2f lv. left.", budget - sum);
            }else {
                double diff = Math.abs(budget - sum);
                System.out.println("Lyubo doesn't have enough money.");
                System.out.printf("He needs %.2f lv. more.", diff);
            }
        }
    }
