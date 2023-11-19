// Solution for problem 645.

class Solution {
    public int[] findErrorNums(int[] nums) {
        int dups[] = new int[2];
        int j = 0;
        while (j < nums.length) {
            int correct = nums[j] - 1;
            if (nums[j] != nums[correct])
                swap(nums, j, correct);
            else
                j++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                dups[0] = nums[i];
                dups[1] = i + 1;
            }

        }
        return dups;
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}