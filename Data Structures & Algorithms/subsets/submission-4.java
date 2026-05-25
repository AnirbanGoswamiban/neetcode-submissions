class Solution {

    public void dfs(int[] nums, int index,List<Integer>curSet,List<List<Integer>> res){
        if(index>=nums.length){
            res.add(new ArrayList<>(curSet));
            return;
        }
        curSet.add(nums[index]);
        dfs(nums,index+1,curSet,res);
        curSet.remove(curSet.size()-1);
        dfs(nums,index+1,curSet,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>curSet=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        dfs(nums,0,curSet,res);
        return res;
        
    }
}
