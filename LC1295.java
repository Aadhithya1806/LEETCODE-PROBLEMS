// Solution for the problem 1295.

class Solution {
    public int findNumbers(int[] nums) {
        int count;
        int evenDigits = 0;
        for (int number : nums) {
            count = 0;
            while (number != 0) {
                number /= 10;
                count++;
            }
            if (count % 2 == 0) {
                evenDigits++;
            }
        }
        return evenDigits;
    }
}