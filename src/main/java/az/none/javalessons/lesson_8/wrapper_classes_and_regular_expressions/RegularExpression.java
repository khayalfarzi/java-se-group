package az.none.javalessons.lesson_8.wrapper_classes_and_regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    // gg:aa:iiiiTss:ss:mm:mmm
    // il ay gun saat:deqiqe

    public static void main(String[] args) {
        String text = "Hello my name is Khayal i study at X university " +
                "and i graduated X university";

        System.out.println(text.contains("study"));

        System.out.println(text.split("i"));

        Pattern pattern = Pattern.compile("study");
        Matcher matcher = pattern.matcher(text);
        System.out.println("Matcher : " + matcher.find());
    }
}