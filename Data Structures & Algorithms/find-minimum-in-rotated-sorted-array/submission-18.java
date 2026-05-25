class Solution {
    public int findMin(int[] nums) {
        int n =nums.length;
        for(int i=0;i<nums.length;i++){
        int prev=(i-1+n)%n;
        int next=(i+1)%n;
        if(nums[prev]>nums[i] && nums[next]>nums[i]){
          return nums[i];
        }
      }
      return nums[0];
    }
}
