package az.none.javalessons.lesson_9.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        GenericClazz<String> stringGenericClazz = new GenericClazz<>();
        String st = "Hello String generic";
        stringGenericClazz.test(st);

        GenericClazz<BMW> bmwGenericClazz = new GenericClazz<>();
        bmwGenericClazz.test(new BMW());

    }
}
