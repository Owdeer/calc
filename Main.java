import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner math = new Scanner(System.in);
        String answer = math.nextLine();
        System.out.println(calc(answer));
    }

    public static String calc(String input) {
        String[] massiveEq = input.split(" ");
        int length = massiveEq.length;
        if (length != 3) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("throws Exception");
            }
            System.exit(0);
        }
        try {
            int a = Integer.parseInt(massiveEq[0]);
            int b = Integer.parseInt(massiveEq[2]);
            if (a < 1 | a > 10 | b < 1 | b > 10) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("throws Exception");
                }
                System.exit(0);
            }
            String c = massiveEq[1];

            switch (c) {
                case ("+"):
                    int answerPlus = a + b;
                    input = String.valueOf(answerPlus);
                    break;
                case ("-"):
                    int answerMinus = a - b;
                    input = String.valueOf(answerMinus);
                    break;
                case ("*"):
                    int answerMult = a * b;
                    input = String.valueOf(answerMult);
                    break;
                case ("/"):
                    int answerDiv = a / b;
                    input = String.valueOf(answerDiv);
                    break;
                default: try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("throws Exception");
                }
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("throws Exception");
            System.exit(0);
        }
        return input;
    }

}
