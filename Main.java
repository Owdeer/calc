import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner math = new Scanner(System.in);
        String answer = math.nextLine();
        calc(answer);
    }

    public static String calc(String input) {
        var massiveEq = input.split(" ");
        int length = massiveEq.length;
        if (length != 3) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("throws Exception");
            }
            System.exit(0);
        }
        try {//try
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
                    int answerEqPlus = a + b;
                    System.out.println(answerEqPlus);
                    break;
                case ("-"):
                    int answerEqMinus = a - b;
                    System.out.println(answerEqMinus);
                    break;
                case ("*"):
                    int answerEqMult = a * b;
                    System.out.println(answerEqMult);
                    break;
                case ("/"):
                    int answerEqDiv = a / b;
                    System.out.println(answerEqDiv);
                    break;
                default: try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("throws Exception");
                }
                System.exit(0);
            }
        } catch (NumberFormatException e) {
            System.out.println("throws Exception");
        }// catch
        return input;
    }
}
