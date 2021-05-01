package az.none.javalessons.lesson_10;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;

public class FindAgesExample {

    public static void main(String[] args) {
        int[] ages = randomAges();

        LocalTime start = LocalTime.now();
        int[] findSlow = findAges(ages);
        LocalTime end = LocalTime.now();

        System.out.println("First : " + (end.getNano() - start.getNano()));

        start = LocalTime.now();
        int[] findFast = findAgesFaster(ages);
        end = LocalTime.now();

        System.out.println("Second : " + (end.getNano() - start.getNano()));

        System.out.println(Arrays.toString(findSlow));
        System.out.println(Arrays.toString(findFast));
    }

    private static int[] randomAges() {
        System.out.println("Random ages method started.");
        Random random = new Random();
        int[] ages = new int[10_000_000];
        for (int i = 0; i < 10_000_000; i++) {
            ages[i] = random.nextInt(150);
        }
        System.out.println("Random ages method ended.");
        return ages;
    }

    private static int[] findAges(int[] ages) {
        int[] count = new int[150];
        for (int i = 0; i < count.length; i++) {
            int ageCount = 0;
            for (int j = 0; j < ages.length; j++)
                if (ages[j] == i)
                    ageCount++;
            count[i] = ageCount;
        }
        return count;
    }

    private static int[] findAgesFaster(int[] ages) {
        int[] count = new int[150];
        for (int age : ages) count[age]++;
        return count;
    }
}