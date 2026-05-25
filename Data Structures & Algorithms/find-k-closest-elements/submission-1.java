class Pair{
    int num;
    int p;
    Pair(int num,int p){
        this.num=num;
        this.p=p;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair>pq=new PriorityQueue<>(
              (a, b) -> {
                if (a.p != b.p) return a.p - b.p; 
                return a.num - b.num;            
            }
        );
        for (int item:arr){
            int distance=Math.abs(item-x);
            pq.add(new Pair(item,distance));
        }
        List<Integer>ls=new ArrayList<>();
        while(!pq.isEmpty() && k!=0){
            k-=1;
            ls.add(pq.poll().num);
        }
        Collections.sort(ls);
        return ls;
    }
}