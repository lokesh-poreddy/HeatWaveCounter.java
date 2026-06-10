import java.util.ArrayList;
import java.util.List;

class MinStack {
    private List<int[]> st;

    public MinStack() {
        st = new ArrayList<>();
    }
    
    public void push(int val) {
        // If the stack is empty, the current value is also the minimum.
        // Otherwise, get the minimum from the current top element.
        int[] top = st.isEmpty() ? new int[]{val, val} : st.get(st.size() - 1);
        int min_val = top[1];
        if (min_val > val) {
            min_val = val;
        }
        st.add(new int[]{val, min_val});        
    }
    
    public void pop() {
        if (!st.isEmpty()) {
            st.remove(st.size() - 1);
        }
    }
    
    public int top() {
        return st.isEmpty() ? -1 : st.get(st.size() - 1)[0];
    }
    
    public int getMin() {
        return st.isEmpty() ? -1 : st.get(st.size() - 1)[1];
    }

    // Added main method to make the class runnable
    public static void main(String[] args) {
        System.out.println("--- Testing MinStack ---");
        
        MinStack minStack = new MinStack();
        
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        
        System.out.println("Current Min (expected -3): " + minStack.getMin()); // Returns -3
        
        minStack.pop();
        
        System.out.println("Top element (expected 0): " + minStack.top());    // Returns 0
        System.out.println("Current Min (expected -2): " + minStack.getMin()); // Returns -2
    }
}