package linear_data_structures.Arrays;

import java.util.Arrays;

public class MoveZeros {
    
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeros(arr)));
    }

    public static int[] moveZeros(int[] arr) {

        int i = 0;
        int j = 0;

        while (j < arr.length) {
            if (arr[j] != 0) {
                int swap = arr[j];
                arr[j] = arr[i];
                arr[i] = swap;
                i ++;
                j ++;
            } else {
                j ++;
            }
        }

        return arr;
    }


}
