class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int maxCount=0;
        int maxNum=nums[0];
        for(int i :nums){
           int count = map.get(i);
           if(count>maxCount){
            maxCount=count;
            maxNum=i;
           }
        }
        return maxNum;
    }
}