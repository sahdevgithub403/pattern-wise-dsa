import java.util.Arrays;

public class MergeSortedArray {

    public static int[] mergeSortedArray(int[] num1, int[] num2) {
        int i = 0, j = 0, idx = 0;
        int n = num1.length;
        int m = num2.length;
        int[] res = new int[n + m];

        while (i < n && j < m) {
            if (num1[i] < num2[j]) {
                res[idx++] = num1[i++];
            } else {
                res[idx++] = num2[j++];
            }
        }

        while (i < n) {
            res[idx++] = num1[i++];
        }

        while (j < m) {
            res[idx++] = num2[j++];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num1 = { 1, 3, 5 };
        int[] num2 = { 2, 4, 6 };
        int[] res = mergeSortedArray(num1, num2);
        System.out.println("Output :" + Arrays.toString(res));

    }
}
