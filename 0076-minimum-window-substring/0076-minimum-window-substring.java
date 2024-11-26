public class Solution {
    public String minWindow(String s, String t) {
        int[] tCount = new int[128];
        int[] sCount = new int[128];
        int required = t.length();
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        String result = "";

        for (char c : t.toCharArray()) {
            tCount[c]++;
        }

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            sCount[rightChar]++;
            if (tCount[rightChar] > 0 && sCount[rightChar] <= tCount[rightChar]) {
                required--;
            }

            while (required == 0) {
                char leftChar = s.charAt(left);
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    result = s.substring(left, right + 1);
                }

                sCount[leftChar]--;
                if (tCount[leftChar] > 0 && sCount[leftChar] < tCount[leftChar]) {
                    required++;
                }
                left++;
            }
            right++;
        }

        return result;
    }
}
