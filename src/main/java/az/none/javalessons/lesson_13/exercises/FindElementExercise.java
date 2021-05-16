package az.none.javalessons.lesson_13.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class FindElementExercise {
    private static final Scanner SC = new Scanner(System.in);
    private static List<String> LIST = new ArrayList<>();

    public static void main(String[] args) {
        loader();
        System.out.print("Enter the element: ");
        String element = SC.next();
        showMessage(element);
    }

    private static void loader() {
        LIST = asList("Red", "Green", "Orange", "White", "Black");
    }

    private static boolean isExist(String element) {
        boolean key = false;
        for (String elem : LIST)
            if (element.equalsIgnoreCase(elem)) {
                key = true;
                break;
            }
        return key;
    }

    private static void showMessage(String element) {
        if (isExist(element))
            System.out.println("Found the element");
        else System.out.println("Not found");
    }
}
