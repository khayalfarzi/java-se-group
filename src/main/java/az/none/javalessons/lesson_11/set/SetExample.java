package az.none.javalessons.lesson_11.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();

        integers.add(878);
        integers.add(5);
        integers.add(11);
        integers.add(6333);
        integers.add(13);
        integers.add(8);
        integers.add(9);
        integers.add(10);

        System.out.println(integers);

//        for (Integer integer:integers)
//            System.out.println(integer);

        integers.remove(0);

//        integers.iterator().next()
    }
}