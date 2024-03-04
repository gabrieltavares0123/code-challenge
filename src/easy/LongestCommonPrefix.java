package easy;

public class LongestCommonPrefix {
    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            return "";
        }
    }

    // Main method to test the longestCommonPrefix method
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Test the method with three example inputs and print the results
        System.out.println(solution.longestCommonPrefix(new String[]{"digital", "dig", "dinner"})); // "di"
        System.out.println(solution.longestCommonPrefix(new String[]{"happy", "harbor", "hard"})); // "ha"
        System.out.println(solution.longestCommonPrefix(new String[]{"apple", "application", "appetite", "app"})); // "app"
    }
}
