public class MaximumSubarray {

    public static int maximumSubarray(int[] nums) {
        int maxFar = nums[0];
        int maxEnd = nums[0];

        for (int j = 1; j < nums.length; j++) {

            maxEnd = Math.max(nums[j], maxEnd + nums[j]);
            maxFar = Math.max(maxFar, maxEnd);
        }

        return maxFar;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 4, -1, 7, 8 };
        int res = maximumSubarray(nums);
        System.out.println("Output : " + res);
    }
}
