public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }
        
        return totalSum - actualSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Output: " + solution.missingNumber(new int[]{3, 0, 1})); // Output: 2
        System.out.println("Output: " + solution.missingNumber(new int[]{0, 1})); // Output: 2
        System.out.println("Output: " + solution.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})); // Output: 8
    }
}
