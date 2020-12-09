import java.util.HashMap;

public class CountLetters {
    public HashMap<Character, Integer> countLetters(String string) {
        char[] stringCharacters = string.toCharArray();
        HashMap<Character, Integer> hashmap = new HashMap();
        int occurrences = 0;


        for (char stringCharacter : stringCharacters) {
            for (char stringCharacter2 : stringCharacters) {
                if (stringCharacter == stringCharacter2) {
                    occurrences++;
                    hashmap.put(stringCharacter, occurrences);
                }
            }
            occurrences = 0;
        }
        return hashmap;
    }
}
