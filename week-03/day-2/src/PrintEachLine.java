//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.Files;
//
//public class PrintEachLine {
//    public static void main(String[] args) {
//        // Write a program that opens a file called "my-file.txt", then prints
//        // each line from the file.
//        // If the program is unable to read the file (for example it does not exist),
//        // then it should print the following error message: "Unable to read file: my-file.txt"
//
//    }
//}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("my-file.txt");
            List<String> lines = Files.readAllLines(path);
            System.out.println(lines);
        } catch (IOException e) {
            System.err.println("Unable to read file: my-file.txt");
        }
    }
}
