package linear_data_structures.Arrays;/*
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
 */

import java.util.HashMap;
import java.util.Map;
 
 public class SingleNumber {
 
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4};

        System.out.println(check(arr));

        System.out.println(8 ^ 8);
    }

    public static int check(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map != null) {
                if (map.get(arr[i]) != null) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                }else {
                    map.put(arr[i], 1);
                }
            }else {
                map.put(arr[i], 1);
            }
        }
        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                return i;
            }
        }

        return 0;
    }
    
 }