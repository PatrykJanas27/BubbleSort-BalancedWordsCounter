import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedWordsCounterTest {
    BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();

    @Test
    void shouldReturnNumberOfBalancedSubwords1() {
        String input = "aabbcbcccbaa";
        Integer expected = 3;
        Assertions.assertEquals(balancedWordsCounter.count(input), expected);
    }

    @Test
    void shouldReturnNumberOfBalancedSubwords2() {
        String input = "Alla";
        Integer expected = 0;
        Assertions.assertEquals(balancedWordsCounter.count(input), expected);
    }

    @Test
    void shouldReturnZero() {
        String input = "";
        Integer expected = 0;
        Assertions.assertEquals(balancedWordsCounter.count(input), expected);
    }

    @Test
    void shouldReturnRuntimeExceptionIfThereIsANumber() {
        String input = "abababa1";
        Assertions.assertThrows(RuntimeException.class, () -> balancedWordsCounter.count(input));
    }

    @Test
    void shouldReturnRuntimeExceptionIfNull() {
        String input = null;
        Assertions.assertThrows(RuntimeException.class, () -> balancedWordsCounter.count(input));
    }

}
