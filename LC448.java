// Solution for problem 468.

import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else
                i++;

        }
        List<Integer> arrayList = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            if (j + 1 != nums[j])
                arrayList.add(j + 1);
        }
        return arrayList;
    }

    static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}