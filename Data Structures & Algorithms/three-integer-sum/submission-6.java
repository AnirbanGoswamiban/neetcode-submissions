class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int curSum=nums[i];
            int l=i+1;
            int h=nums.length-1;
            while(l<h){
                ArrayList<Integer>triplets=new ArrayList<>();
                int currSum=nums[l]+nums[h]+curSum;
                if(currSum==0){
                    triplets.add(curSum);
                    triplets.add(nums[l]);
                    triplets.add(nums[h]);
                    res.add(triplets);
                    while (l < h && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < h && nums[h] == nums[h - 1]) {
                        h--;
                    }
                    l+=1;
                    h-=1;
                }else if(currSum>0){
                    h-=1;
                }else{
                    l+=1;
                }
            }
        }
        return res;
    }
}
