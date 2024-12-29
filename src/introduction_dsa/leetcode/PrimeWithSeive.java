package introduction_dsa.leetcode;

import java.util.Arrays;

class Solution {
    /*   public static boolean isPrime(int num){
        for(int i = 2; i <= num/2; i++){
            if(num%i == 0) return false;
        }
        return true;
    }
    public int countPrimes(int n) {
        int count = 0;
        for(int i = 2; i < n; i ++){
            if(isPrime(i)){
                count ++;
                System.out.println(i);
            }
        }
        return count;
    } */

     public static void main(String[] args) {

       int n = 20;
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        int count = 0;
    
        for(int i = 2; i < n; i ++ ){
            if(primes[i]) {
              System.out.println("From i loop");
                count ++;

                for(int j = i * i ; j < n; j=j+i ){
                    primes[j] = false;
                    System.out.println("From j loop");
                }
            }
        }
        System.out.println(count);
     }
}
