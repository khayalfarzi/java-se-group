package az.none.javalessons.lesson_6.tasks;

public class NByNMatrix {

    public static void main(String[] args) {

        display(100);
    }

    static void display(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(" * ");
            System.out.println();
        }
    }
}
