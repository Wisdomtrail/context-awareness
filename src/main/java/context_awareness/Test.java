package context_awareness;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(multiply(-5, 5));
    }


    public static int multiply(int firstNumber, int secondNumber){
        int answer  = 0;
        int counter;
        int multiplier;
        if (firstNumber < 0){
            counter = secondNumber;
            multiplier = firstNumber;
        }
        else
        if (secondNumber < 0){
            counter = firstNumber;
            multiplier = secondNumber;
        }
        else {
            counter = firstNumber;
            multiplier = secondNumber;
        }

        for (int i = 0; i < counter; i++) {
            answer+=multiplier;
        }

        return answer;
    }
}
