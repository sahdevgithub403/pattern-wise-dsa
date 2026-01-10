import java.util.Arrays;

public class RemoveDublicate {

    public static int[] removeDublicate(int[] num) {
        int n = num.length;

        if (n <= 1) {
            return num;
        }

        int j = 1;

        for (int i = 1; i < n; i++) {
            if (num[i] != num[i - 1]) {
                num[j++] = num[i];
            }
        }
        return Arrays.copyOf(num, j);
    }

    public static void main(String[] args) {
        int[] num = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] res = removeDublicate(num);
        System.out.println("Output :" + Arrays.toString(res));

    }
}
