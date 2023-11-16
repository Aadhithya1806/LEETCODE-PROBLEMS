import java.lang.reflect.Array;

class LC1929 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        System.out.println("sadadad");
        System.out.println(getConcatenation(arr));

    }

    public static int[] getConcatenation(int[] nums) {
        int newLength = 2 * nums.length;
        int ans[] = new int[newLength];
        int index = 0;
        int i = 0;
        while (index < (2 * nums.length)) {

            if (index == nums.length)
                i = 0;

            ans[index] = nums[index % nums.length];
            System.out.println("new index " + index);
            System.out.println("old index " + i);
            i++;
            index++;
        }
        System.out.println(index);
        System.out.println(i);

        return ans;

    }
}