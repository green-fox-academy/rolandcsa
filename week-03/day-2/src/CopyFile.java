// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
    public static void main(String[] args) {
        System.out.println(copyFile());
    }

    public static boolean copyFile() {
        try {
            Path filePath = Paths.get("src/my-file3.txt");
            Path filePath2 = Paths.get("src/my-file4.txt");
            Files.copy(filePath, filePath2);
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}

