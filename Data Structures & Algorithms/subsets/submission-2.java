class Solution {

        public static void dfs(int[] nums,int index,List<Integer> subsets, List<List<Integer>> res){
        if(index>=nums.length){
            res.add(new ArrayList<Integer>(subsets));
            return;
        }
        subsets.add(nums[index]);
        dfs(nums,index+1,subsets,res);
        subsets.remove(subsets.size()-1);
        dfs(nums,index+1,subsets,res);
        return;
    }

    public List<List<Integer>> subsets(int[] nums) {
                List<List<Integer>> res = new ArrayList<>();
        dfs(nums,0,new ArrayList<>(),res);
        return res;
    }
}
