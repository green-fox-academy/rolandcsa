import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

    CountLetters countLetters;

    @Before
    public void setup() {
        countLetters = new CountLetters();
    }

    @Test
    public void countLetters_pass() {
        HashMap<Character, Integer> hashMap = countLetters.countLetters("something interesting");
        int expected = 3;
        int actual = hashMap.get('e');
        assertEquals(expected, actual);
    }

    @Test
    public void countLetters_upperCaseDifference() {
        HashMap<Character, Integer> hashMap = countLetters.countLetters("SoMeThInG InTeReStInG");
        int expected = 2;
        int actual = hashMap.get('T');
        assertEquals(expected, actual);
    }

    @Test
    public void countLetters_emptyString() {
        HashMap<Character, Integer> hashMap = countLetters.countLetters("");
        assertTrue(hashMap.isEmpty());
    }
}
