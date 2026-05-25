class Solution {
        public int dfs(int index,int res,int sum,int[] nums){
        if(index>=nums.length){
            res = res+sum;
            return res;
        }
        return dfs(index+1, res, sum^nums[index], nums)+dfs(index+1, res, sum, nums);
    }
    public int subsetXORSum(int[] nums) {
                int res=dfs(0, 0, 0, nums);
        return res;
    }
}