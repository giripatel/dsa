package Sorting;

import java.util.Arrays;

/**
 * [9, 5, 10, 3, 4, 2]
 * [5, 9, 3, 4, 2, 10]
 *      i j
 * [5, 3, 4, 2, 9, 10]
 */

public class Sorter {
    public static void main(String[] args) {
        int[] arr = {1, 9, 5, 10, 3, 4, 2, 23};

//        int[] arr = {10, 3, 4, 2};
//        for (int i = 0; i < arr.length; i ++){
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        mergeSort(arr);
//        practInsertionSort(arr);
        pracMergerSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int index1, int index2, int[] arr) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j -1] > arr[j]){
                    int temp = arr[j -1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if (!swap) break;
        }
        return arr;
    }

    private static int[] selectionSort(int[] arr) {

            for (int i = 0; i < arr.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < arr.length; j ++) {
                    if (arr[j] < arr[i]) {
                        minIndex = j;
                    }
                }
                swap(i, minIndex, arr);
            }
            return arr;
    }

    private static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int currentEle = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > currentEle ) {
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j + 1] = currentEle;
        }
        return arr;
    }

//    private static void mergeSort(int[] arr, int left, int right){
//        if (left > right) return;
//        int mid = (right + left) / 2;
//        mergeSort(arr, left, mid - 1);
//        mergeSort(arr, mid + 1, right);
//        merge(arr, left, right);
//    }

    public static void mergeSort(int[] arr){
        if (arr.length < 2) return;

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        int index = 0;
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[index ++];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[index ++];

        }
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int index = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]){
                arr[index ++] = left[i ++];
            } else {
                arr[index ++] = right[j ++];
            }
        }

        while (i < left.length) {
            arr[index ++] = left[i ++];
        }

        while (j < right.length) {
            arr[index ++] = right[j ++];
        }
    }

    private static void practInsertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j + 1] = current;
        }
    }

    private static void pracMergerSort(int[] arr){
        if (arr.length < 2) return;

        int mid = arr.length / 2;

        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }
        int temp = mid;
        for (int i = 0; i < arr.length - mid; i++) {
            right[i] = arr[temp++];
        }

        pracMergerSort(left);
        pracMergerSort(right);

        practMerge(arr, left, right);
    }

    private static void practMerge(int[] arr, int[] left, int[] right) {
     int i = 0;
     int j = 0;
     int k = 0;

     while (j < left.length && i < right.length) {
         if (left[i] > right[j]) {
             arr[k++] = right[j ++];
         }else {
             arr[k ++] = left[i ++];
         }
     }

     while (i < left.length) {
        arr[k ++] = left[i ++];
     }
        while (j < right.length) {
            arr[k ++] = right[j ++];
        }
    }
}
