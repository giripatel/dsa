package linear_data_structures.Queues;

import java.util.Arrays;

public class MyQueue {
    private int size;
    private int front;
    private int rare;
    private int[] queue;
    private int count;

    public MyQueue(int size){
        this.size = size;
        queue = new int[size];
        this.rare = 0;
        this.front = -1;
        this.count = 0;
    }

    public void offer(int item){
        if (count == size){
            System.out.println("Queue is full");
            return;
        }

        queue[rare] = item;
        rare = (rare + 1) % size;
        count ++;
    }

    public void poll(){
        if (count == 0){
            System.out.println("Queue is empty...");
            return;
        }
        front = (front + 1) % size;
        count --;
        System.out.println(queue[front]);
        queue[front] = 0;
    }

    public String toString(){
        return Arrays.toString(queue);
    }
}
