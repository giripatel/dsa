package introduction_dsa.bitwise;

public class ToDecimal {
  public static void main(String[] args) {
    int str = 1010;
    int decimalValue = 0;
    int i =0;
    while (str != 0) {
      if (str%10 != 0) {
         decimalValue += Math.pow(2,i);
         System.out.println(i);
      }
      i ++;
    str = str/10;
    }
    System.out.println(decimalValue);
  }
}
