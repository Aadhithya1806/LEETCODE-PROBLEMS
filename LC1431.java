// Solution for problem 1431.

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highestCandy = max(candies);
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int afterExtra = candies[i] + extraCandies;
            if (afterExtra >= highestCandy) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    static int max(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}