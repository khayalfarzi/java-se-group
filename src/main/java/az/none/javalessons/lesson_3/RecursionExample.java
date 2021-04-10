package az.none.javalessons.lesson_3;

public class RecursionExample {

    public static void main(String[] args) {
//        recursion();
        System.out.println(fac(5));
    }

    public static void recursion() {
        System.out.println("Hello Seymur");
        recursion();
    }

    public static int fac(int number) {
        return number > 1 ? number * fac(number - 1) : 1;
    }
}
