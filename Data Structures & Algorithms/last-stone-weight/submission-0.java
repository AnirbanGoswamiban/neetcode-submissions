class Solution {
    public int getWeight(int[] stones){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            pq.offer(i);
        }
        while(pq.size()>1){
            int stone1=pq.poll();
            int stone2=pq.poll();
            int remStone=stone1-stone2;
            if(remStone>0){
                pq.offer(remStone);
            }
        }
        if(pq.size()==0){
            return 0;
        }
        return pq.poll();

    }
    public int lastStoneWeight(int[] stones) {
        return getWeight(stones);
    }
}
