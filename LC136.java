// Solution for problem number 136.

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int number : nums) {
            result ^= number;
        }
        return result;
    }
}