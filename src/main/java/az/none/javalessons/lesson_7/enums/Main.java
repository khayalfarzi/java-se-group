package az.none.javalessons.lesson_7.enums;

public class Main {

    public static void main(String[] args) {

//        System.out.println(Month.APRIL);
//
//        System.out.println(Month.APRIL.getValue());
//
//        for (Month month : Month.values())
//            System.out.println(month.getValue());

        for (Error error : Error.values())
            System.out.println(error + " : " + error.getCode() + " : " + error.getDescription());
    }
}
