// Solution for 1365.
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] = new int[nums.length];
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j] < nums[i]) {
                    count++;

                }
                ans[i] = count;

            }
        }
        return ans;
    }
}