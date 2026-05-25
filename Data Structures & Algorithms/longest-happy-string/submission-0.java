class Pair {
    String data;
    int priority;

    Pair(String data, int priority) {
        this.data = data;
        this.priority = priority;
    }

    void setP(int priority) {
        this.priority = priority;
    }
    public static Comparator<Pair> priorityComparator = (p1, p2) -> Integer.compare(p2.priority, p1.priority);
}

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder res = new StringBuilder();

        Pair pairA = new Pair("a", a);
        Pair pairB = new Pair("b", b);
        Pair pairC = new Pair("c", c);

        PriorityQueue<Pair> pq = new PriorityQueue<>(Pair.priorityComparator);
        if (a > 0) pq.add(pairA);
        if (b > 0) pq.add(pairB);
        if (c > 0) pq.add(pairC);

        while (!pq.isEmpty()) {
            List<Pair> list = new ArrayList<>();

            
            while (!pq.isEmpty() && res.length() >= 2 &&
                   res.charAt(res.length() - 1) == pq.peek().data.charAt(0) &&
                   res.charAt(res.length() - 2) == pq.peek().data.charAt(0)) {
                list.add(pq.poll());
            }

            if (pq.isEmpty()) break; 

            Pair correctPair = pq.poll();
            res.append(correctPair.data);
            correctPair.setP(correctPair.priority - 1);

            if (correctPair.priority > 0) {
                pq.add(correctPair);
            }
            pq.addAll(list);
        }

        return res.toString();
    }

}