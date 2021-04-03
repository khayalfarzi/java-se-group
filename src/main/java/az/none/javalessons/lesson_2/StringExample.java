package az.none.javalessons.lesson_2;

public class StringExample {

    public static void main(String[] args) {

        String first = "Hello";
        String second = "World";


        String firstS="Hello";
        String secondS="Hello";

        int a = 5;

        String con = first.concat(second);

        System.out.println(first + "" + second); //crap
        System.out.println("Concat" + con); //
        System.out.println("first'un deyeri" + first);
        System.out.println(String.format("first'in deyeri %s", first));
        System.out.println(String.format("%s %s", first, second));

        System.out.println("Menim adim \"Xeyal\"dir");

        System.out.println("New line example \n Second new line example");
    }
}
