package linear_data_structures.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 17;
        // return the indexes of the two numbers that add up to the target

         System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    

    public static int[] twoSum(int[] arr, int target) {
        int[] indexes = {0,0};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i ++) {
            int num =  target - arr[i];
            System.out.println(num);
            if (map.get(num) != null) {
                 indexes[0] = map.get(num);
                 indexes[1] = i;
                 return indexes;
            } else { 
                map.put(arr[i], i);
            }
            
        }

        return indexes;
    }

    // Bruteforce approch
    /* public static int[] twoSum(int[] arr, int target) {
        int[] indexes = {0,0};

        for (int i = 0; i < arr.length -1; i++) {
            for(int j = i + 1; j < arr.length; j ++){
                if ((arr[i] + arr[j]) == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                }
            }
        }
        return indexes;
    } */


}
