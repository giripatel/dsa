package linear_data_structures.Arrays;

import java.util.Arrays;
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0, 0, 0};
        int[] nums2 = {2,5,6};
        // int[] nums1 = {0};
        // int[] nums2 = {1};

        System.out.println(Arrays.toString(mergeArray(nums1, 3, nums2, nums2.length)));
    }

    public static int[] mergeArray(int[] nums1, int m, int[] nums2, int n) {

        while (m > 0 && n > 0) {
            if (nums1[m -1] > nums2[n -1]) {
                nums1[m + n -1] = nums1[m-1];
                m --;
            } else {
                nums1[m + n -1] = nums2[n -1];
                n --;
            }
        }

        while (n > 0) {
            nums1[m + n -1] = nums2[n -1];
            n --;
        }

        return nums1;
    }
}
