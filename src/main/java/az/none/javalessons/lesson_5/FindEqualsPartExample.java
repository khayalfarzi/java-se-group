package az.none.javalessons.lesson_5;

public class FindEqualsPartExample {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++)
            for (int j = 0; j < 10; j++)
                for (int k = 0; k < 10; k++)
                    for (int l = 0; l < 10; l++)
                        if ((i + j) == (k + l))
                            System.out.printf("%d%d%d%d%n", i, j, k, l);
    }
}