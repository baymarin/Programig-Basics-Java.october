    package FirstStepsInCoding.NestedLoopsLab;

    import java.util.Scanner;

    public class Combinatons_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num = Integer.parseInt(scanner.nextLine());
            int validNum = 0;
            for (int x1 = 0; x1 <=num  ; x1++) {
                for (int x2 = 0; x2 <=num ; x2++) {
                    for (int x3 = 0; x3 <= num ; x3++) {
                        if (x1 + x2 + x3 == num){
                            validNum ++;
                        }
                    }
                }
            }
            System.out.println(validNum);
        }
    }
