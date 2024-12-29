package introduction_dsa.bitwise;

import java.util.Scanner;

public class BitwiseAnd {
   public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);

        // String input
        System.out.println("Please enter a number");
        int num = sc.nextInt();
System.out.println(num & 1);
        if ((num & 1) != 0) {
          System.out.println(num + " an odd number");
        } else {
          System.out.println(num + " is an even number");
        }
   }
}
