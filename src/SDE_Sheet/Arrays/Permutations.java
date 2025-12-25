package SDE_Sheet.Arrays;

import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        List<List<Integer>> permutations = new LinkedList<>();

        List<Integer> temp = new LinkedList<>();
        boolean[] picked = new boolean[arr.length];
        getPermu(arr, picked, temp, permutations);
        System.out.println(permutations);

    }

    private static void getPermu(int[] arr, boolean[] picked, List<Integer> list, List<List<Integer>> ans) {
        if (arr.length == list.size()) {
            ans.add(new ArrayList<>(list));
            return;
        };

        for (int i = 0; i < arr.length; i++) {
            if (!picked[i]){
                picked[i] = true;
                list.add(arr[i]);
                getPermu(arr, picked, list, ans);
                picked[i] = false;
                list.remove(list.size() -1);
            }
        }
    }
}
