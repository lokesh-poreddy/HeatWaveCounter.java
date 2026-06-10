import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
       class Solution {
    public int maxArea(int [] height) {
        int maxWater = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int width = j - i;
            int currHeight = Math.min(height[i],height[j]);
            int currWater = width * currHeight;
            if (currWater > maxWater) {
                maxWater = currWater;
            }
            if (height[i] < height[j]) {
                i++;
            }else {
                j--;
            }
        }
        return maxWater;
    }
}
       Solution solution = new Solution();
       int [] height = {1,8,6,2,5,4,8,3,7};
       System.out.println(solution.maxArea(height));
    }
}