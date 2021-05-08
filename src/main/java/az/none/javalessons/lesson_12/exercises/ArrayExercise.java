package az.none.javalessons.lesson_12.exercises;

import java.util.Scanner;

public class ArrayExercise {
    /*
     * 1 2 3 4 5
     * 6 7 8 9 6
     * 7 3 4 5 6
     * 8 3 4 5 5
     * 9 3 4 5 5
     * */
    private static final int[][] arr = new int[3][3];
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==================== APPLICATION IS STARTED ====================");
        loader();
        System.out.print("Enter element : ");
        int elem = SCANNER.nextInt();

        String response = findElementIndexes(elem);
        System.out.println(response);
        System.out.println("==================== APPLICATION IS STOPPED ====================");
    }

    private static String findElementIndexes(int elem) {
        String indexes = "Not founded";
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                if (arr[i][j] == elem)
                    indexes = String.format("[%s , %s]", i, j);
        return indexes;
    }

    private static void loader() {
        arr[0][0] = 9;
        arr[0][1] = 1;
        arr[0][2] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[1][2] = 5;
        arr[2][0] = 6;
        arr[2][1] = 7;
        arr[2][2] = 8;
    }
}