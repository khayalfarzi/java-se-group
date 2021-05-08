package az.none.javalessons.lesson_12.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LambdaExample {

    private static final List<Person> PEOPLE = new ArrayList<>(5);
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==================== APPLICATION IS STARTED ====================");
        loader();
        System.out.print("Enter id : ");
        int id = SCANNER.nextInt();

        //Standard 'for' way
        for (int i = 0; i < PEOPLE.size(); i++) {
            if (PEOPLE.get(i).getId() == id)
                System.out.println(PEOPLE.get(i));
        }

        // Standard 'forEach' way
        for (Person person : PEOPLE) {
            if (person.getId() == id)
                System.out.println(person);
        }

        // Lambda ways
        PEOPLE.forEach(person -> {
            if (person.getId() == id)
                System.out.println(person);
        });

        PEOPLE.stream()
                .filter(person -> person.getId() == id)
                .forEach(System.out::println);

        //Standard way
        List<String> names = new ArrayList<>();
        for (Person person : PEOPLE)
            names.add(person.getName());

        for (int i = 0; i < PEOPLE.size(); i++) {
            names.add(PEOPLE.get(i).getName());
        }

        for (String name : names)
            System.out.println(name);

        // Lambda ways
        List<String> namesWithLambda =
                PEOPLE.stream()
                        .map(person -> {
                            return person.getName();
                        }).collect(Collectors.toList());

        namesWithLambda = PEOPLE.stream()
                .map(person -> person.getName())
                .collect(Collectors.toList());

        namesWithLambda = PEOPLE.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("==================== APPLICATION IS STOPPED ====================");
    }

    private static void loader() {
        PEOPLE.add(new Person(1, "Name 1", "Surname 1", 11));
        PEOPLE.add(new Person(2, "Name 2", "Surname 2", 22));
        PEOPLE.add(new Person(3, "Name 3", "Surname 3", 33));
        PEOPLE.add(new Person(4, "Name 4", "Surname 4", 44));
        PEOPLE.add(new Person(5, "Name 5", "Surname 5", 55));
    }
}