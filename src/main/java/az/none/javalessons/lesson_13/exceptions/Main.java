package az.none.javalessons.lesson_13.exceptions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String element = null;

        try {
            System.out.println(element.length());
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}