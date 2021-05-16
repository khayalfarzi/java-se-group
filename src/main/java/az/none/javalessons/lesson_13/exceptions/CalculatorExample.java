package az.none.javalessons.lesson_13.exceptions;

import java.util.Scanner;

public class CalculatorExample {

    public static void main(String[] args) throws RuntimeException {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        try {
            System.out.println(num1 / num2);
        } catch (RuntimeException exception) {
            throw new RuntimeException("Runtime exception");
        } finally {
            System.out.println("Finally block");
        }
    }
}