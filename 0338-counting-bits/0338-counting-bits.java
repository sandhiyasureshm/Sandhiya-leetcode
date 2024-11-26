public class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] result1 = solution.countBits(2);
        System.out.println("Output: " + java.util.Arrays.toString(result1)); // Output: [0, 1, 1]

        int[] result2 = solution.countBits(5);
        System.out.println("Output: " + java.util.Arrays.toString(result2)); // Output: [0, 1, 1, 2, 1, 2]
    }
}
