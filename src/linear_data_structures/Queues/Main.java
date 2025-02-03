package linear_data_structures.Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        ReverseQueueRec revQ = new ReverseQueueRec();
        System.out.println(revQ.rev(queue));
//        System.out.println(queue);


/*
        DoublyQueue queue = new DoublyQueue(4);
        queue.pushFront(1);
        queue.pushFront(2);
        queue.pushRare(3);
        queue.pushRare(4);


//        System.out.println(queue.popFront());
//        System.out.println(queue.popFront());
//        System.out.println(queue.popFront());
//        System.out.println(queue.popFront());
//        System.out.println(queue.popFront());
        System.out.println(queue.popRare());
//        System.out.println(queue.popRare());

        System.out.println(queue);
 */
      /*  MyQueue queue = new MyQueue(2);
        queue.offer(1);
        queue.offer(2);
        queue.poll();
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

//        queue.poll();
//        queue.poll();
//        queue.poll();
        System.out.println(queue); */
    }
}
