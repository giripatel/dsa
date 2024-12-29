package linear_data_structures.Strings;

public class IndexOfFirstOccurance {
  public static void main(String[] args) {
    
    String needle = "a";
    String haystack = "a";

    System.out.println(haystack.substring(0,needle.length()));
    IndexOfFirstOccurance in = new IndexOfFirstOccurance();
    System.out.println(in.strStr(haystack,needle));
  }
  public int strStr(String haystack, String needle) {

        int needleLength = needle.length();
        int haystackLength = haystack.length();

        if(needleLength > haystackLength) return -1;

        int currentLength = needleLength;
        for(int i = 0;  currentLength <= haystackLength; i ++){
            String subString = haystack.substring(i,currentLength);
            if(subString.equals(needle)){
                return i;
            }
            currentLength = needleLength + i + 1;
        }
        return -1;
    }
}
