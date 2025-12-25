package SDE_Sheet.Arrays;

import java.util.ArrayList;

public class MergeIntervels {
    public static void main(String[] args) {
//       int[][] arr =  {{1,3},{2,6},{8,10},{15,18}};
        int[][] arr = {{1,4}, {4,5}};

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> begin = new ArrayList<>();
        begin.add(arr[0][0]);
        begin.add(arr[0][1]);
        res.add(begin);
       for (int i = 1; i < arr.length; i ++){

           if (arr[i - 1][1] >= arr[i][0]){
               ArrayList<Integer> temp = res.get(res.size() -1);
               temp.remove(1);
               temp.add(arr[i][1]);
           } else {
               ArrayList<Integer> list = new ArrayList<>();
               list.add(arr[i][0]);
               list.add(arr[i][1]);
               res.add(list);
           }
       }
        System.out.println(res);
    }
}
