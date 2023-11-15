// solution for problem 1920
class Solution {
    public int[] buildArray(int[] nums) {

        // int newIndex = 0;
        // int result [] = new int[nums.length];
        // for(int i = 0; i <= nums.length-1; i++){
        // newIndex = nums[i];
        // result[i] = nums[nums[i]];
        // }

        // return result;
        // MORE OPTIMIZED IN TERMS OF SPACE
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + nums.length * (nums[nums[i]] % nums.length);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] / nums.length;
        }
        return nums;
    }
}