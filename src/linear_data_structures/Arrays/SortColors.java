package linear_data_structures.Arrays;

import java.util.Arrays;

/**
 * SortColors
 */
public class SortColors {

    public static void main(String[] args) {
        int[] arr = {2,2,1,0,2,0,0,1};
        int i = 0;
        int j = arr.length -1;
        int k = 0;

        while (j >= k) {
            int swap;
            if (arr[k] == 0) {
                System.out.println(arr[k]);
                swap = arr[k];
                arr[k] = arr[i];
                arr[i] = swap;
                k ++;
                i ++;
            }else if (arr[k] == 2) {
                swap = arr[k];
                arr[k] = arr[j];
                arr[j] = swap;
                j --;
            }else {
                k ++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}