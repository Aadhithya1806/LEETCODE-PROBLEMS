// Solution for problem 66.

class Solution {
    public int[] plusOne(int[] digits) {
        int last = digits.length - 1;
        if (digits[last] == 9) {
            int lastIndexCount = last;
            while (digits[lastIndexCount] == 9 && lastIndexCount != 0) {
                lastIndexCount--;
            }
            if (lastIndexCount == 0 && digits[lastIndexCount] == 9) {
                int result[] = new int[last + 2];
                result[0] = 1;
                return result;
            } else if (digits[lastIndexCount] != 9) {
                for (int i = lastIndexCount; i <= last; i++) {
                    if (digits[i] == 9)
                        digits[i] = 0;
                    else
                        digits[i] = digits[i] + 1;
                }
                return digits;
            }
        } else
            digits[last] = digits[last] + 1;

        return digits;
    }

}