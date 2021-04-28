package az.none.javalessons.lesson_9;

public class Main {

    public static void main(String[] args) {

        SubClazz subClazz = new SubClazz();
        subClazz.test();

        SuperClazz clazz = new SubClazz();
        clazz.test();
    }
}
