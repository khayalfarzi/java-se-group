package az.none.javalessons.lesson_8.wrapper_classes_and_regular_expressions;

public class WrapperExample {

    public static void main(String[] args) {

        int a = 5;
        long b = 75;

        Object o = new Object();

        Integer integer = new Integer(5);
        Long aLong = new Long(78);

        Integer.toBinaryString(99);

        int num1 = 8;
        Integer num2 = num1;
        int num3 = num2;

        long num4 = 2021;
        int num5 = (int) num4;

        int num6 = 2021;
        long num7 = num6;

        // int :  1 2 3 4 5
        // long : 1 2 3 4 5 6 7 8 9
        // num4 = 8;
        // num5 = 3;
    }
}