//public class Doubled {
//
//    public static void main(String[] args) {
//        // Create a method that decrypts the duplicated-chars.txt
//
//
//    }
//}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        decrypt();
    }

    public static void decrypt() {
        try {
            Path filePath = Paths.get("src/doubled.txt");
            List<String> lines = Files.readAllLines(filePath);
            String sentence;

            for (String line : lines) {
                sentence = "";
                for (int i = 0; i < line.length() - 1; i += 2) {
                    sentence = sentence + String.valueOf(line.charAt(i));
                }
                System.out.println(sentence);
            }
        } catch (IOException e) {

        }
    }
}

// Not finished