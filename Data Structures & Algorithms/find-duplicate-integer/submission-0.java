class Solution {
    public int findDuplicate(int[] nums) {
        int[] map=new int[nums.length];
        for(int i :nums){
            map[i-1]+=1;
        }
        for (int i = 0; i < map.length; i++) {
            if(map[i]>=2){
                return i+1;
            }
        }
        return 0;
    }
}
