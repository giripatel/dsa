package introduction_dsa.recurssion;

public class Quiz5 {
    public static void main(String[] args) {
        System.out.println(fun(5));
    }

    private static int fun(int n) {
        int x = 1,k;
        if (n == 1) return x;
        for (k = 1; k < n; ++k){
            System.out.println(k);
            x = x + fun(k) * fun(n - k );
        }
        return x;
    }
}
