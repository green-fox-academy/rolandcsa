import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

    Sum sum;

    @Before
    public void setup() {
        sum = new Sum();
    }

    @Test
    public void sumElements_multipleElementList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        int expected = 9;
        int actual = sum.sumElements(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void sumElements_emptyList() {
        List<Integer> numbers = new ArrayList<>();
        int expected = 0;
        int actual = sum.sumElements(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void sumElements_oneElementList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        int expected = 2;
        int actual = sum.sumElements(numbers);
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void sumElements_nullPointerExceptionExpected() {
        List<Integer> numbers = null;
        sum.sumElements(numbers);
    }
}