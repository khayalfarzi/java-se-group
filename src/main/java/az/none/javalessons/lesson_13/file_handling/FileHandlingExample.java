package az.none.javalessons.lesson_13.file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample {

    public static void main(String[] args) {
        System.out.println("Process started.");

        //Java File
        File file = new File("D:\\ideaproject\\java-se-group\\src\\main\\java\\az\\none\\javalessons\\lesson_13\\MyFile.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }

        //Java File writing
        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < 200; i++) {
                writer.write(String.format("Hello Java File handling with us. %s \n", i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Java File reading
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext())
                System.out.println(scanner.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Process successfully ended.");
    }
}
