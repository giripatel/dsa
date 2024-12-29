package introduction_dsa.recurssion;

public class SquareRoot {
  
  public static void main(String[] args) {
    
  /*  int num = 3;
    int square = 0;
    for (int i = 1; i < 4; i++) {
      System.out.println(num);
      square = square + (num * num) ;
    }
    System.out.println(square); */
 
    System.out.println(findPower(3,3));
  }

  public static int findPower(int num, int power) {

    if (power == 1) {
      return 3;
    }

 
     return num * findPower(num, power -1);
  }
}
