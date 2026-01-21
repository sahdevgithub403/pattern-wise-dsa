import java.util.Arrays;

class SingleNumber2 {

    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        int diff = xor & -xor;

        int a = 0, b = 0;
        for (int num : nums) {
            if ((num & diff) != 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }

        return new int[] { a, b };
    }

    public static void main(String[] args) {
        SingleNumber2 obj = new SingleNumber2();

        int[] nums = { 1, 2, 1, 3, 2, 5 };
        int[] res = obj.singleNumber(nums);

        System.out.println(Arrays.toString(res));
    }
}
