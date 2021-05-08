package az.none.javalessons.lesson_12.exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySortingExercise {

    private static final int[][] arr = new int[4][4];
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==================== APPLICATION IS STARTED ====================");
        loader();
        System.out.println("Initial array: \n");
        show();

        for (int[] array : arr)
            Arrays.sort(array);

        System.out.println("Sorted array: \n");
        show();
        System.out.println("==================== APPLICATION IS STOPPED ====================");
    }

    private static void loader() {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = random.nextInt(100);
    }

    private static void show() {
        for (int[] ints : ArraySortingExercise.arr) {
            for (int anInt : ints) System.out.printf("%s ", anInt);
            System.out.println();
        }
    }
}
