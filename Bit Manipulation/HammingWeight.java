public class HammingWeight {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n =  2147483645;
        int res = hammingWeight(n);
        System.out.println(res);
    }
}
