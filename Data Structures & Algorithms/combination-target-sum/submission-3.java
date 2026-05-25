class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) { 
        List<List<Integer>> res=new ArrayList<>();
        dfs(res,0,target,nums,new ArrayList<Integer>(),0);
        return res;
        
    }
    public void dfs(List<List<Integer>> res,int sum,int target,int[] nums,List<Integer> curList,int index){
        if(sum==target){
            res.add(new ArrayList<Integer>(curList));
            return;
        }
        if(nums.length==index || sum > target){
            return;
        }
        curList.add(nums[index]);
        sum+=nums[index];
        dfs(res,sum,target,nums,curList,index);
        curList.remove(curList.size()-1);
        sum-=nums[index];
        dfs(res,sum,target,nums,curList,index+1);
        return;

    }
}
