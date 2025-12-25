package SDE_Sheet.Arrays;

import java.util.Arrays;

public class Sum_of_All_Odd_Length_Subarrays {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
//        System.out.println(bruteForce(arr));
        System.out.println(betterSol(arr));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            int totalSubArrays = (i + 1) * (n - i);
            int oddSubArrays = (totalSubArrays + 1) / 2;
            sum += arr[i] * oddSubArrays;
        }

        return sum;
    }

    private static int betterSol(int[] arr){

        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j += 2) {
                if (i == 0) {
                    sum += arr[j];
                } else {
                    sum += arr[j] - arr[i - 1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return sum;
    }

    private static int bruteForce(int[] arrr) {
        int sum = 0;

        for (int i = 0; i < arrr.length; i++) {
            for (int j = i; j < arrr.length; j++) {
                if ((j - i + 1) % 2 == 1){
                    for (int k = i; k <= j; k++) {
                        sum += arrr[k];
                    }
                }

            }
        }
        return sum;
    }
}
