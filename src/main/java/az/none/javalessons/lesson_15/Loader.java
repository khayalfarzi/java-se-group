package az.none.javalessons.lesson_15;

import java.util.List;

import static java.util.Arrays.asList;

public class Loader {

    public static List<Person> load() {
        return asList(
                new Person(1, "Khayal", "Farziyev", 23),
                new Person(2, "Seymur", "Talibov", 43),
                new Person(3, "Taleh", "Talehli", 12),
                new Person(4, "Dunya", "Dunyayeva", 34),
                new Person(5, "Alem", "Alemli", 96),
                new Person(6, "Gulbeniz", "Farziyeva", 195),
                new Person(7, "Aybeniz", "Farziyevaaa", 20),
                new Person(8, "Eli", "Farziyevvvv", 22)
        );
    }
}