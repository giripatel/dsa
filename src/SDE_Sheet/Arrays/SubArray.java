package SDE_Sheet.Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<List<Integer>> list = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> temp = new LinkedList<>();
            for (int j = i; j < arr.length; j++) {
                temp.add(arr[j]);
                list.add(new ArrayList<>(temp));
            }
        }

        System.out.println(list);
    }
}
