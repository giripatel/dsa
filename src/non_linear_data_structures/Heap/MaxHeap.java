package non_linear_data_structures.Heap;

import java.time.chrono.MinguoDate;

public class MaxHeap {
    int[] heap;
    int size;

    public MaxHeap(int size){
        this.heap = new int[size];
        this.size = 0;
    }

    public void insert(int value){
        if (heap.length == size) return;
        heap[size] = value;
        size++;

        int i = size -1;
        while (size > 0 && heap[i] > getParent(i)){
            swap(i, getParentIndex(i));
            i = getParentIndex(i);
        }
    }

    private void swap(int index1, int index2){
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    private int getParent(int index){
        return heap[getParentIndex(index)];
    }

    private int getParentIndex(int index){
        return (index - 1) / 2;
    }

    public int remove(){
        int element = heap[0];

        heap[0] = heap[size - 1];
        heap[size - 1] = 0;
        size--;

        int i = 0;

        while (size > 0 && !isValidParent(i)){
            swap(i,getGraaterChildIndex(i));
            i = getGraaterChildIndex(i);
        }

        return element;
    }

    private boolean isValidParent(int index){
        boolean isGreater = heap[index] > getGreaterChild(index);
        if (!hasLeftChild(index) && !hasRightChild(index) && isGreater) return true;
        if (!hasLeftChild(index)) return false;

        return isGreater;
    }
    private boolean hasRightChild(int index){
        return getRightChildIndex(index) < size;
    }

    private boolean hasLeftChild(int index){
        return getLeftChildIndex(index) < size;
    }

    private int getLeftChildIndex(int i){
        return i * 2 + 1;
    }

    private int getRightChildIndex(int i){
        return i * 2 + 2;
    }

    private int getGraaterChildIndex(int index){
        if (!hasRightChild(index)) return getLeftChildIndex(index);
        return heap[getLeftChildIndex(index)] > heap[getRightChildIndex(index)] ? getLeftChildIndex(index) : getRightChildIndex(index);
    }

    private int getGreaterChild(int index){
        return heap[getGraaterChildIndex(index)];
    }
}
