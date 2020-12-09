import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String firstWord, String secondWord) {
        char[] firstWordCharacters = firstWord.toLowerCase().toCharArray();
        char[] secondWordCharacters = secondWord.toLowerCase().toCharArray();
        Arrays.sort(firstWordCharacters);
        Arrays.sort(secondWordCharacters);
        return Arrays.equals(firstWordCharacters, secondWordCharacters);
    }
}

