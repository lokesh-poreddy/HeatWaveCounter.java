import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
        // Base case: If the temporary list matches the size of the array, we have a complete permutation row
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        // Iterate across the elements to fill the current position
        for (int i = 0; i < nums.length; i++) {
            // If the element is already used in the current path, skip it
            if (used[i]) continue;

            // Choose the element
            used[i] = true;
            tempList.add(nums[i]);

            // Explore further down the state tree
            backtrack(result, tempList, nums, used);

            // Backtrack (Undo the choice)
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        Permutations p = new Permutations();
        int[] arr = {1, 2, 3};
        
        List<List<Integer>> allPermutations = p.permute(arr);
        
        System.out.println("--- Generated Permutation Grid (" + allPermutations.size() + " x " + arr.length + ") ---");
        // Print out the structural grid representations
        for (List<Integer> row : allPermutations) {
            System.out.println(row);
        }
    }
}