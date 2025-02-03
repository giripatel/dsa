package linear_data_structures.Queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>(2);

        System.out.println(q.add(1));
        System.out.println(q.add(2));
        System.out.println(q.add(3));
        System.out.println(q.add(4));
        System.out.println(q.peek());
        System.out.println(q);

    }
}
