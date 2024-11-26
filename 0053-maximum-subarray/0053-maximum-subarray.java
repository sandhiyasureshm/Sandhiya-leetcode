public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Output: " + solution.maxSubArray(nums1));

        int[] nums2 = {1};
        System.out.println("Output: " + solution.maxSubArray(nums2));

        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Output: " + solution.maxSubArray(nums3));
    }
}
