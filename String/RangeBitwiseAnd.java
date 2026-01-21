public class RangeBitwiseAnd {
    public static int rangeBitwiseAnd(int left, int right) {

        while (right > left) {
            right = right & (right - 1);
        }
        return right;
    }

    public static void main(String[] args) {
        int left = 5, right = 7;
        int res = rangeBitwiseAnd(left, right);
        System.out.println(res);
    }
}
