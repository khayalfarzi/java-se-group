package az.none.javalessons.lesson_11.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListWay {

    private static final List<Person> PEOPLE = new ArrayList<>(5);
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        loadData();
        System.out.print("Enter id : ");
        int id = SCANNER.nextInt();
        for (Person person : PEOPLE)
            if (person.getId() == id)
                System.out.println(person);
    }

    public static List<Person> loadData() {
        PEOPLE.add(new Person(1, "Name 1", "Surname 1", 11));
        PEOPLE.add(new Person(2, "Name 2", "Surname 2", 22));
        PEOPLE.add(new Person(3, "Name 3", "Surname 3", 33));
        PEOPLE.add(new Person(4, "Name 4", "Surname 4", 44));
        PEOPLE.add(new Person(5, "Name 5", "Surname 5", 55));
        return PEOPLE;
    }
}