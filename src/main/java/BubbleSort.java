import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BubbleSort {

    public double[] sort(double[] numbers) throws RuntimeException { // O(n^2)
        if (numbers == null) {
            throw new RuntimeException("The input should be not null!");
        }
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; ++j) {
                if (numbers[j + 1] < numbers[j]) {
                    swap(numbers, j);
                }
            }
        }
        return numbers;
    }

    public List<Double> sort(List<Double> input) throws RuntimeException { // O(n^2)
        if (input == null) {
            throw new RuntimeException("The input should be not null!");
        }
        List<Double> listWithoutNulls = input.stream().filter(Objects::nonNull).toList();
        Double[] numbers = listWithoutNulls.toArray(Double[]::new);
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; ++j) {
                if (numbers[j + 1] < numbers[j]) {
                    swap(numbers, j);
                }
            }
        }
        return Arrays.stream(numbers).toList();
    }

    private void swap(Double[] doubles, int j) {
        double tmp = doubles[j];
        doubles[j] = doubles[j + 1];
        doubles[j + 1] = tmp;
    }

    private void swap(double[] doubles, int j) {
        double tmp = doubles[j];
        doubles[j] = doubles[j + 1];
        doubles[j + 1] = tmp;
    }
}
