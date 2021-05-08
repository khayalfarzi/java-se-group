package az.none.javalessons.lesson_12.functional_programming;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class FuncProgExample {
    static Predicate<Integer> positive = integer -> integer > 0;
    static Function<String, String> function = s -> s.toUpperCase(Locale.ROOT);

    public static void main(String[] args) {
        System.out.println(positive.test(6));
        System.out.println(function.apply("Hi Seymur"));
    }
}