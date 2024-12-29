package introduction_dsa.recurssion;


public class PrintLowerNums {
  
  public static void main(String[] args) {
    
  //  Scanner scan = new Scanner(System.in);
//    int num = scan.nextInt();

   System.out.println(printAll(10));
  }

  public static int printAll(int num) {
    System.out.println(num);
    if(num == 1) return 1;
    
    return num + printAll(num - 1);
  }
}


