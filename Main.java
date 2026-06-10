import java.util.Arrays;
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
public class Main {
    public static void main(String[] args) {
        // Create the solution object
        Solution solver = new Solution();
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("array = " + Arrays.toString(array));
        int result = solver.maxSubArray(array);
        System.out.println("Maximum Subarray Sum = " + result);
    }
}