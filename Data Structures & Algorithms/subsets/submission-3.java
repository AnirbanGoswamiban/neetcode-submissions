class Solution {
    public void dfs(int index,List<List<Integer>>res,List<Integer>subsets,int[] nums){
        if(index>=nums.length){
            res.add(new ArrayList<>(subsets));
            return;
        }
        subsets.add(nums[index]);
        dfs(index+1, res, subsets, nums);
        subsets.remove(subsets.size()-1);
        dfs(index+1, res, subsets, nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        dfs(0,res, new ArrayList<Integer>(),nums);
        return res;
    }
}
