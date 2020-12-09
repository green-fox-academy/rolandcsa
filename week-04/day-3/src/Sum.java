import java.util.List;

public class Sum {
    public Integer sumElements(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum = sum + number;
        }
        return sum;
    }
}
