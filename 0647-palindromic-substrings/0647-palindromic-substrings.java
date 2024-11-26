public class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        boolean[][] dp = new boolean[n][n];

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (len == 1) {
                    dp[i][j] = true; // A single character is always a palindrome
                } else if (len == 2) {
                    dp[i][j] = s.charAt(i) == s.charAt(j); // Check for two characters
                } else {
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]; // Check for substrings of length > 2
                }
                
                if (dp[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }
}
