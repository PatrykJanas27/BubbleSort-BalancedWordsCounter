import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BalancedWordsCounter {

    public Integer count(String input) {
        if (input.isEmpty()) {
            return 0;
        }
        if (input == null) {
            throw new RuntimeException("The input should be not null!");
        }

        char[] chars = input.toCharArray();
        for (char Char : chars) {
            if (!((Char >= 65 && Char <= 90) || (Char >= 97 && Char <= 122))) {
                throw new RuntimeException("The input should contain the letters only!");
            }
        }
        Map<Character, Integer> uniqueChars = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (!uniqueChars.containsKey(chars[i])) {
                int integer = 1;
                uniqueChars.put(chars[i], integer);
            } else {
                Integer integer = uniqueChars.get(chars[i]);
                integer = integer + 1;
                uniqueChars.put(chars[i], integer);
            }
        }
        int number = uniqueChars.get(chars[0]);
        boolean balanced = isBalanced(uniqueChars, number);
        if (!balanced) {
            System.out.println("The input word \"" + input + "\" is not balanced!");
            return 0;
        }
        System.out.println("The input word \"" + input + "\" is balanced and there exist "
                + uniqueChars.size() + " balanced subwords!");
        return uniqueChars.size();
    }

    private static boolean isBalanced(Map<Character, Integer> uniqueChars, int number) {
        boolean isBalanced = true;
        Set<Map.Entry<Character, Integer>> entries = uniqueChars.entrySet();

        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry);
            if (entry.getValue() != number) {
                isBalanced = false;
            }
        }
        return isBalanced;
    }
}
