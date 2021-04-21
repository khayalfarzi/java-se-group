package az.none.javalessons.lesson_7.exercises;

public class LeapYearChecker {

    public static final String NAME = "Name";

    public static boolean check(int year) {
        if ((year % 4) == 0)
            if ((year % 100) == 0)
                return (year % 400) == 0;
            else return true;
        else return false;
    }
}
