import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    Anagram anagram;

    @Before
    public void setup() {
        anagram = new Anagram();
    }

    @Test
    public void isAnagram_pass() {
        assertTrue(anagram.isAnagram("hello", "ohell"));
        assertFalse(anagram.isAnagram("hello", "bello"));
    }

    @Test
    public void isAnagram_UpperCase() {
        assertTrue(anagram.isAnagram("Hello", "Ohell"));
    }
}