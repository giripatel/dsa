package linear_data_structures.Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class BaiscQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        // ADDS to the queue | Throws an exception if it is full
        queue.add(1);
        // ADDS to the queue | Doesn't throw any error if it is full
        queue.offer(2);
        // REMOVES from the queue | Throws an exception if it is empty
        queue.remove();
        // REMOVES from the queue | Doesn't throw any error if it is empty
        queue.poll();
        // Returns the first element in the queue
        queue.peek();

        queue.isEmpty();
        System.out.println(queue.isEmpty());

    }
}
