// Solution for problem 1929

class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[2 * nums.length];
        int index = 0;
        while (index < (2 * nums.length)) {
            ans[index] = nums[index % nums.length];
            index++;
        }
        return ans;

    }
}