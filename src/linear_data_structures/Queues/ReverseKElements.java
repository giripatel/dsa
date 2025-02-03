package linear_data_structures.Queues;

import java.util.Queue;

public class ReverseKElements {
    public Queue<Integer> reverseEle(Queue<Integer> q, int k){
        if(k <= 0 || q.isEmpty()) return q;
        int x = q.poll();
        reverseEle(q,k - 1);
        q.offer(x);

        return q;
    }
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        q = reverseEle(q,k);
        // add code here.
        for(int i = 0; i < q.size() - k; i ++){
            q.offer(q.poll());
        }
        return q;
    }
}
