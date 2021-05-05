package az.none.javalessons.lesson_11.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise {

    private static final List<Integer> LIST = new ArrayList<>(10);
    private static final Set<Integer> SET = new HashSet<>(10);

    public static void main(String[] args) {
        loadData();
        showTable();
    }

    private static void loadData() {
        for (int i = 1; i <= 10; i++) {
            LIST.add(i);
            SET.add(i);
        }
    }

    private static void showTable() {
        LISTL:
        for (Integer list : LIST) {
            SETL:
            for (Integer set : SET) {
                System.out.printf("%s * %s = %s%n", list, set, (list * set));
            }
            System.out.println();
        }
    }
}