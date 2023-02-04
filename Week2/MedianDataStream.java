package Week2;
/*
 PriorityQueue<Integer> minheap;
    PriorityQueue<Integer> maxheap;
    public MedianFinder() {

        minheap = new PriorityQueue<>();
        maxheap = new PriorityQueue<>((a,b) -> b - a);
    }

    public void addNum(int num) {

        if(maxheap.isEmpty() || num <= maxheap.peek()) {
            maxheap.add(num);
        } else {
            minheap.add(num);
        }


        if(maxheap.size() > minheap.size() + 1) {
            minheap.add(maxheap.poll());
        } else if(maxheap.size() < minheap.size()) {
            maxheap.add(minheap.poll());
        }
    }

    public double findMedian() {

        if(maxheap.size() == minheap.size()) {
            return (maxheap.peek() + minheap.peek())/2.0;
        }
        return maxheap.peek();
    }

 */

