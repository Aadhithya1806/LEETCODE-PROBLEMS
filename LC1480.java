class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int i = 0;
        for (int number : nums) {
            sum += number;
            nums[i] = sum;
            i++;

        }
        return nums;

    }
}