public class ReverseNElements {
    public static void reverseFirstN(int[] arr, int n) {
        // Safety check to handle edge cases
        if (arr == null || n <= 1 || n > arr.length) {
            return; 
        }

        int left = 0;
        int right = n - 1; // Only go up to the n-th element

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 4; // We only want to reverse the first 4 elements ([1, 2, 3, 4])
        
        reverseFirstN(arr, n);
        
        System.out.println("Array after reversing first " + n + " elements:");
        for (int val : arr) {
            System.out.print(val + " "); // Output: 4 3 2 1 5 6 7 8
        }
    }
}