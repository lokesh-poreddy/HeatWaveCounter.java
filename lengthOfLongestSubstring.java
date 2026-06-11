import java.util.Arrays; // Added this import to fix compilation error

public class lengthOfLongestSubstring {
    public int LongestSubstring(String s) {
        int n = s.length();
        int len = 0;
        
        // ASCII character tracker (tracks the last seen index of each character)
        int[] pos = new int[128];
        Arrays.fill(pos, -1);
        
        int left = 0; // Left boundary of our sliding window
        
        // Expand the right boundary of the window
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            
            // If the character was seen inside the current window, 
            // jump the left boundary to the right of its last seen position
            if (pos[currentChar] >= left) {
                left = pos[currentChar] + 1;
            }
            
            // Update/Record the latest index of the current character
            pos[currentChar] = right;
            
            // Calculate window size and update max length
            len = Math.max(len, right - left + 1);
        }
        
        return len;
    }
}