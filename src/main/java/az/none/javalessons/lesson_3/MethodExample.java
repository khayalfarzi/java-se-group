package az.none.javalessons.lesson_3;

import az.none.javalessons.lesson_4.Person;

public class MethodExample {

    public String name;

    public static int param=5;

    public static void main(String[] args) {
        voidMethod();
        voidMethod2("Parameter");
        System.out.println(sayHello());
        System.out.println(calculate(5));

    }

    public static void voidMethod() {
    }

    public static void voidMethod2(String param) {
        System.out.println(param);
    }

    public static String sayHello() {
        return "Hello";
    }

    public static String sayHello(String say) {
        return "Hello";
    }

    public static int calculate(int number) {
        int multiply = number * 2;
        return multiply;
    }
}