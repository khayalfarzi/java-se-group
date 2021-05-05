package az.none.javalessons.lesson_11.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapWay {

    private static final Map<Integer, Person> MAP = new HashMap<>(5);
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        loadData();
        System.out.print("Enter id : ");
        System.out.println(MAP.get(SCANNER.nextInt()));
    }

    private static void loadData() {
        for (Person person : ListWay.loadData())
            MAP.put(person.getId(), person);
    }
}