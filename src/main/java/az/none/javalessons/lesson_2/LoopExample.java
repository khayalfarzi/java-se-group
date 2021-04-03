package az.none.javalessons.lesson_2;

public class LoopExample {

    public static void main(String[] args) {

        int[] arr = {3, 5, 8, 9};

        for (int i = 0; i < args.length; i++) {
            System.out.println(arr[i]);
        }

        for (int elem : arr) {
            System.out.println(elem);
        }

        int a = 0;
        while (a < arr.length) {
            System.out.println(arr[a]);
            a++;
        }
    }

    public int test(int a){
        return 2;
    }
}