import java.util.Arrays;

public class TwoNumbers {

    public static int[] twoNumbers(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        // ArrayList<Integer> arr = new ArrayList<>();
        // int[] res = new int[2];

        while (i < j) {

            int iythSum = nums[i] + nums[j];

            if (iythSum == target) {
                // arr.add(i + 1);
                // arr.add(j + 1);
                // res[0] = arr.get(0);
                // res[1] = arr.get(1);
                // return res;
                return new int[] { i + 1, j + 1 };
            }

            if (iythSum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] res = twoNumbers(nums, target);
        System.out.println("Output : " + Arrays.toString(res));
    }
}