package az.none.javalessons.lesson_4;

import java.util.Scanner;

public class NumericalMarkEquivalence {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a number : ");
        int number = in.nextByte();

        if (number < 0 || number > 10)
            System.out.println("The number of you entered is not between 0 and 10");
        else {
            if (number <= 4)
                System.out.println("Suspenso");
            else if (number == 5)
                System.out.println("Aprobado");
            else if (number == 6)
                System.out.println("Bien");
            else if (number == 7 || number == 8)
                System.out.println("Notable");
            else System.out.println("Sobresaliente");
        }
    }
}
