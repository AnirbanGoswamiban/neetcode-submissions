class MedianFinder {

    PriorityQueue<Integer> minPq;
    PriorityQueue<Integer> maxPq;

    public MedianFinder() {
        this.minPq=new PriorityQueue<>(Collections.reverseOrder());
        this.maxPq=new PriorityQueue<>();
    }
    
    public void addNum(int num) {

        minPq.add(num);
        maxPq.add(minPq.poll());
        if (minPq.size() < maxPq.size()) {
        minPq.add(maxPq.poll());
    }
    }
    
    public double findMedian() {
        if(maxPq.size()>minPq.size()){
            return maxPq.peek();
        }
        if(maxPq.size()<minPq.size()){
            return minPq.peek();
        }
        return (maxPq.peek()+minPq.peek())/2.0;
    }
}
