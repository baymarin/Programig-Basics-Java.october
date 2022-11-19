package FirstStepsInCoding.WhileLoopMoreExc;

import java.util.Scanner;

public class StreamOfLetters_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String word = "";
        String letter = "";
        boolean o = false;
        boolean n = false;
        boolean c = false;
        while (!command.equals("End")) {
            char valid = command.charAt(0);
            if (valid >= 'a' && valid <= 'z' || valid >= 'A' && valid <= 'Z') {
                switch (command) {
                    case "o":
                        if (o) {
                            word += command;
                        }
                        o = true;
                        break;
                    case "c":
                        if (c) {
                            word += command;
                        }
                        c = true;
                        break;
                    case "n":
                        if (n) {
                            word += command;
                        }
                        n = true;
                        break;
                    default:
                        word += command;
                        break;
                }
                if (o && c && n){
                    System.out.print(word + " ");
                    o = false;
                    c = false;
                    n = false;
                    word = "";
                }
            }
            command = scanner.nextLine();
        }
    }
}
