
DATE : 20-Nov-2025
LEVEL : Easy
TOPIC : Queue

class RecentCounter {
    Queue<Integer> q;

    public RecentCounter() {
        q=new LinkedList<>();
    }
    
    public int ping(int t) {
        q.add(t);
        while(q.peek()<t-3000){
            q.poll();//removes and returns front element of queue
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */