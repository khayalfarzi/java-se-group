package az.none.javalessons.lesson_14;

import java.util.Scanner;

public class ExceptionExercise {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Application started.");
        process();
        System.out.println("Application ended.");
    }

    private static void process() {
        System.out.print("Enter the number : ");
        int numOne = getNumber();
        System.out.print("Enter the number : ");
        int numTwo = getNumber();
        System.out.println(String.format("RESULT : %s", calculate(numOne, numTwo)));
    }

    private static int getNumber() {
        int number = 0;
        try {
            number = SC.nextInt();
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
        return number;
    }

    private static int calculate(int numOne, int numTwo) {
        int result = 0;
        try {
            result = numOne / numTwo;
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
        return result;
    }
}