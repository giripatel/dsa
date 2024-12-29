package linear_data_structures.Arrays;

/**
 * RotateArray
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;

        // System.out.println(Arrays.toString(rotate(arr, k)));
    }   

    
    
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums,0, nums.length -1);
        reverse(nums,0, k -1);
        reverse(nums,k, nums.length -1);
    }
    
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
    }
   /*  GENERAL ROTATION
    public static int[] rotate(int[] arr, int k) {

        for(int j = 1; j <= k; j ++) {
            int temp = arr[arr.length-1];
            for(int i = arr.length-2; i >= 0; i --){
                arr[i +1] = arr[i];
            }
            arr[0] = temp;
        }
        return arr;
    } */
    // USING O(N) SPACE
  /*  public static int[] rotate(int[] arr, int k) {

        int length = arr.length;
        int[] newArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            newArray[(i + k)% length] = arr[i];
        }

        return newArray;

    } */

    /*
    public static int[] rotate(int[] arr, int k) {

        int lastdigit;
        for(int j = 1; j <= 1; j ++){
            System.out.println("outer loop");
            lastdigit = arr[arr.length -1];
            int l = arr.length - 1;
            for(int i = arr.length -1; i > 0; i --) {
                System.out.println(l);
                int temp = arr[-- l];
                if(i == 1){
                    System.out.println("not l");
                    arr[0] = lastdigit;
                } else {
                    arr[i] = temp;
                }
            }
        }

        /*
         * for(int i = 1; i < arr.length -1; i ++) {
                num2 = arr[i -1];
                System.out.println(i);
                // System.out.println(num2);
                if(i == (arr.length -2)){

                    arr[0] = num2;
                } else {
                    arr[i + 1] = num2;
                }
            }
         
        
        return arr;
    } */ 
}