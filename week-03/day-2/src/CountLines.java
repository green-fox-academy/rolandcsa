// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        countLines();
    }

    public static void countLines() {
        try {
            Path path = Paths.get("src/countlines.txt");
            List<String> lines = Files.readAllLines(path);
            System.out.println(lines.size());
        } catch (IOException e) {
            System.err.println("0");
        }
    }
}
