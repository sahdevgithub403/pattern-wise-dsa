public class JumpGame {

    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int lastGoodIndex = n - 1;

        for (int i = n - 2; i >= 0; i--) {
            if (i + nums[i] >= lastGoodIndex) {
                lastGoodIndex = i;
            }
        }
        return lastGoodIndex == 0;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 };
        boolean res = canJump(nums);
        System.out.println("Output : " + res);

    }
}
