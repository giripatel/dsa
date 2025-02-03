package linear_data_structures.Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class InterleaveHalf {
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayDeque<>();

        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <= 10; i++) {
            q.offer(i);
        }
        int size = q.size();

        for (int i = 0; i < size /2; i++){
            q1.offer(q.poll());
        }

        for (int i = 0; i < size / 2; i ++){
            q.offer(q1.poll());
            q.offer(q.poll());
        }
    }
}
