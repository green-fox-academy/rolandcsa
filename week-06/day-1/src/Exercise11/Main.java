package Exercise11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> wiki = new ArrayList<>();
        Path filePath = Paths.get("src/Exercise11/wiki.txt");
        try {
            wiki = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.err.println("Could not read file");
        }
//        Not finished
    }
}
