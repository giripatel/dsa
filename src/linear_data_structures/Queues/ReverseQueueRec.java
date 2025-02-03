package linear_data_structures.Queues;

import java.util.Queue;

public class ReverseQueueRec {
    public Queue<Integer> rev(Queue<Integer> q){
        if (q.isEmpty()) return q;
        int x = q.poll();
        rev(q);
        q.offer(x);
        return q;
    }

//    public
}
