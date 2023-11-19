// Solution for Problem 442.

import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        List<Integer> duplicates = new ArrayList<>();
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                duplicates.add(nums[j]);
            }
        }
        return duplicates;
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}