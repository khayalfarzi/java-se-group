package az.none.javalessons.lesson_7.exercises;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = scanner.nextInt();

        if (LeapYearChecker.check(year))
            System.out.println("Leap");
        else System.out.println("Not Leap");
    }
}