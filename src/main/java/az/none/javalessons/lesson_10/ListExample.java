package az.none.javalessons.lesson_10;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> integersLinked = new LinkedList<>();
        List<Integer> integersVector = new Vector<>();

        integers.add(45);
        integers.add(89);
        integers.add(84);
        integers.add(859);
        integers.add(859);
        integers.add(839);
        integers.add(8932);
        integers.add(86429);
        integers.add(8684659);
        System.out.println("List add element using add() method : " + integers);

        integers = Arrays.asList(1, 5, 6, 8, 12, 34, 56, 98, 89);
        System.out.println("List add element using Arrays.asList() method : " + integers);

//        integers.remove(4);
//        System.out.println("List remove method after deleted 12 : " + integers);

        System.out.println("List get method : " + integers.get(5));

        integers.set(1, 989);
        System.out.println("List after set() method" + integers);
    }
}