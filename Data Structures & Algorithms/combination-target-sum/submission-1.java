class Solution {
    public static List<List<Integer>> dfs(int[] nums,int index,List<List<Integer>> res,List<Integer> cur,int sum,int target){
        if(sum==target){
            res.add(new ArrayList<>(cur));
            return res;
        }
        if(sum > target || index>=nums.length){
            return res;
        }
        cur.add(nums[index]);
        sum+=nums[index];
        dfs(nums,index,res,cur,sum,target);
        cur.remove(cur.size()-1);
        sum-=nums[index];
        dfs(nums,index+1,res,cur,sum,target);
        return res;
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        return dfs(nums,0,new ArrayList<>(),new ArrayList<>(),0,target);
    }
}
