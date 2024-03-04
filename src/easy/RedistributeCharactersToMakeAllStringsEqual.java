package easy;

import java.util.HashMap;
import java.util.Map;

public class RedistributeCharactersToMakeAllStringsEqual {
    static class Solution {
        public boolean makeEqual(String[] words) {
            HashMap<String, Integer> wordsCount = new HashMap<>();
            for (String word : words) {
                String[] letters = word.split("");
                for (String letter : letters) {
                    if (wordsCount.containsKey(letter)) {
                        Integer count = (Integer) wordsCount.get(letter);
                        wordsCount.compute(letter, (key, value) -> value = value + 1);
                    } else {
                        wordsCount.put(letter, 1);
                    }
                }
            }

            for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
                if (!(entry.getValue() % words.length == 0)) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // Testing with the example inputs
        System.out.println(solution.makeEqual(new String[]{"aaa", "bbb", "ccc", "abc"})); // true
        System.out.println(solution.makeEqual(new String[]{"ab", "bc", "cd", "de", "ea"})); // false
        System.out.println(solution.makeEqual(new String[]{"zzx", "xzz", "zxz"})); // true
    }
}
