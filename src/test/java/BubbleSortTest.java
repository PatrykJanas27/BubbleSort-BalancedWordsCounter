import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {
    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    void shouldReturnSortedAscendingArray() {
        double[] input = {1, 4, 5, 6, 8, 3, 8};
        double[] expected = {1, 3, 4, 5, 6, 8, 8};
        Assertions.assertArrayEquals(bubbleSort.sort(input), expected);
    }

    @Test
    void shouldReturnSortedAscendingDoubleArray() {
        double[] input = {-9.3, 0.2, 4, 0.1, 5, 9};
        double[] expected = {-9.3, 0.1, 0.2, 4, 5, 9};
        Assertions.assertArrayEquals(bubbleSort.sort(input), expected);
    }

    @Test
    void shouldReturnEmptyArray() {
        double[] input = {};
        double[] expected = {};
        Assertions.assertArrayEquals(bubbleSort.sort(input), expected);
    }

    @Test
    void shouldReturnWithoutNull() {
        List<Double> input = Arrays.asList(null, 5.0001);
        List<Double> expected = Arrays.asList(5.0001);
        List<Double> result = bubbleSort.sort(input);
        Assertions.assertEquals(result, expected);
    }

    @Test
    void shouldReturnException() {
        List<Double> input = null;
        Assertions.assertThrows(RuntimeException.class, () -> bubbleSort.sort(input));
    }
}
