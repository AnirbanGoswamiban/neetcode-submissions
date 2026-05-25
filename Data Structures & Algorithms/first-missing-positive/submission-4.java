class Solution {
        public int[] getMinMax(int[] nums){
        int minNum=Integer.MAX_VALUE;
        int maxNum=Integer.MIN_VALUE;
        for(int num:nums){
            minNum=Math.min(minNum, num);
            maxNum=Math.max(maxNum, num);
        } 
        int[] res={minNum,maxNum};
        return res;
    }
    public int firstMissingPositive(int[] nums) {
         HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int [] minmax=getMinMax(nums);
        for(int i=0;i<=minmax[1];i++){
            list.add(i);
        }
        for(int num:list){
            if(num>0){
                if(!set.contains(num)){
                    return num;
                }
            }
        }
        if(list.size()==0){
            return 1;
        }
        int res=list.get(list.size()-1);
       return res+1;
    }
}