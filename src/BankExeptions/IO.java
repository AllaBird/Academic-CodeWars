package BankExeptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Scanner;

public class IO {
    private static String readFile(String name) throws IOException {
        return Files.readString(Path.of(name));
    }
    private static String tryMe(int i) {
        if (i > 10) {
            throw new RuntimeException();
        } else {
            return "ok";
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            System.out.println("Trying");
            System.out.println(tryMe(1));
            System.out.println("Success");
        }catch (RuntimeException e) {
            System.out.println("Error");
        }finally {
            System.out.println("FINALLY");

        }
    }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter file name: ");
//        String fileName = scanner.nextLine();
//        try {
//
//            String content = readFile(fileName);
//            System.out.println("-------------");
//            System.out.println(content);
//        } catch (NoSuchFileException e) {
//            System.out.println("No such file: " + fileName);
//            System.out.println("Try again");
//        }
//    }
}