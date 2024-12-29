package introduction_dsa.bitwise;

class ConverToBinary {
       public static void main(String args[]) {
        int n = 64;
        int count = 0;
        while (n != 0) {
          int lastBit = n & 1;
          if (lastBit == 1) {
            count++;
          }
          n = n >> 1;
        }
        System.out.println(count);

    }
}
