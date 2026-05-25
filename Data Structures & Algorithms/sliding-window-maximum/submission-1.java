class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        TreeMap<Integer,Integer>map=new TreeMap<>();
        List<Integer>list=new ArrayList<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while((i-j)+1==k){
                int d = map.lastKey();
                list.add(d);
                map.put(nums[j],map.get(nums[j])-1);
                if(map.get(nums[j])<=0){
                    map.remove(nums[j]);
                }
                j+=1;
            }
        }
        // System.out.println(list);
        // System.out.println(set);
        return  list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
