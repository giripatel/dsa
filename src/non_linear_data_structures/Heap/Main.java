package non_linear_data_structures.Heap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 10, 2, 4, 16, 8};

        MaxHeap heap = new MaxHeap(arr.length);
        for (int i = 0; i < arr.length; i++) {
            heap.insert(arr[i]);
        }

        System.out.println(heap);
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap);
    }
}
