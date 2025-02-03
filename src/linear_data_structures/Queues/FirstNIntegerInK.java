package linear_data_structures.Queues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class FirstNIntegerInK {

    public static long[] printFirstNegativeInteger(long A[], int N, int K){
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        ArrayList<Long> result = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            if (A[i] < 0)
                dq.add(i);
        }

        if (!dq.isEmpty()){
            result.add(A[dq.getFirst()]);
        }else {
            result.add(0l);
        }

        for (int i = K; i < N; i++) {
            if (!dq.isEmpty() && i - dq.getFirst() >= K){
                dq.removeFirst();
            }

            if (A[i] < 0){
                dq.add(i);
            }

            if (!dq.isEmpty()){
                result.add(A[dq.getFirst()]);
            } else {
                result.add(0l);
            }
        }
        long[] ans = new long[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 5;
        long[] A = {-8, 2, 3, -6,10};
        int K = 2;

        System.out.println(Arrays.toString(printFirstNegativeInteger(A,N,K)));
    }
}
