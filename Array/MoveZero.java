import java.util.Arrays;

public class MoveZero {

    public static void moveZero(int[] num) {
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                num[index++] = num[i];
            }
        }
        
        while (index < num.length) {
            num[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] num = { 0, 1, 0, 3, 12 };
        moveZero(num);
        System.out.println("output : " + Arrays.toString(num));
    }
}
