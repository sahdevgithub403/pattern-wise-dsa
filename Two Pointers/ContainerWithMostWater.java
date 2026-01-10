public class ContainerWithMostWater {

    public static int containerWithMostWater(int[] height) {

        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;

        while (i < j) {
            int currArea = Math.min(height[i], height[j]) * (j - i);
            maxArea = Math.max(maxArea, currArea);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;

    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println("ouptut : " + containerWithMostWater(height));
    }
}