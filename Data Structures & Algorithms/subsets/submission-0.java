class Solution {
    public static List<List<Integer>> dfs(int[] arr, int index, List<List<Integer>> res, List<Integer> cursets) {
        res.add(new ArrayList<>(cursets)); // Add current subset

        for (int i = index; i < arr.length; i++) {
            cursets.add(arr[i]); // Include element
            dfs(arr, i + 1, res, cursets); // Recursive call (use `i + 1`)
            cursets.remove(cursets.size() - 1); // Backtrack
        }

        return res;
    }
    public List<List<Integer>> subsets(int[] nums) {
        return dfs(nums, 0, new ArrayList<>(), new ArrayList<>());
    }
}
