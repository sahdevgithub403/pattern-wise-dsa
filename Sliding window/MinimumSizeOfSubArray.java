public class MinimumSizeOfSubArray {

    public static int minimumSizeOfSubArray(int[] arr, int target){
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum >= target) {
                
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int res = minimumSizeOfSubArray(arr, target);
        System.out.println(res);
    }
}