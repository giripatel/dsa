package linear_data_structures.Queues;

import java.util.Arrays;

public class DoublyQueue {

    private int[] queue;
    private int size;
    private int front;
    private int rare;
    private int count;

    public DoublyQueue(int size){
        this.size = size;
        front = 0;
        rare = 0;
        count = 0;
        queue = new int[size];
    }

    public void pushRare(int value) {
        if (isFull()) return;
        queue[rare] = value;
        rare = (rare + 1) % size;
        count ++;
    }

    public void pushFront(int value){
        if (isFull()) return;
        if ((front - 1) == -1) {
            front = size-1;
        }else {
            front --;
        }
        queue[front] = value;
        count ++;
    }

    public int popRare(){
        if (isEmpty()) return -1;

        if ((rare - 1) == -1) {
            rare = size - 1;
        }else {
            rare --;
        }

        int ele = queue[rare];
        queue[rare] = 0;
        count --;
        return ele;
    }

    public int popFront(){
        if (isEmpty()) return -1;

        int ele = queue[front];
        queue[front] = 0;
        front = (front + 1) % size;
        count --;
        return ele;
    }
    public int getRear()
    {
        if(isEmpty()) return -1;
        int lastIndex = rare -1;
        if((rare -1) == -1) lastIndex = size -1;
        return queue[lastIndex];
    }

    public boolean isFull(){
        return  count == size;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public String toString(){
        return Arrays.toString(queue);
    }
}
