import java.util.Arrays;

public class RemoveDublicateArray {

    public static int[] removeDublicateArray(int[] nums) {
        int n = nums.length;

        if (n <= 1) {
            return nums;
        }

        int j = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j++] = nums[i];
            }
        }

        return Arrays.copyOf(nums, j);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 3, 4, 4 };
        int[] res = removeDublicateArray(nums);
        System.out.println("Output : " + Arrays.toString(res));
    }
}
