package linear_data_structures.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InterSection {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1,3,5,6,6,9,10,11,11};
        int[] nums2 = {2,2,1,3,11};

        System.out.println(Arrays.toString(interSection(nums1, nums2)));

    }

    public static int[] interSection(int arr1[], int[] arr2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> interSectionElementsSet = new HashSet<>();
        
        for(int num : arr1) {
            set.add(num);
        }

        for(int num : arr2){
            if (set.contains(num) && !interSectionElementsSet.contains(num)) {
                interSectionElementsSet.add(num);
            }
        }

        // int[] a2 = Integer.parseInt(interSectionElementsSet.toArray().toString());
        // Iterator list = interSectionElementsSet.iterator();
        int[] elemets = new int[interSectionElementsSet.size()];
        // for(int i = 0; i < elemets.length; i ++){
        //     elemets[i] = (int) list.next();
        // }
        int index = 0;
        for (Integer i : interSectionElementsSet) {
            elemets[index++] = i;
        }


        // int[] interSectionElements =  interSectionElementsSet.toArray(new Integer[interSectionElementsSet.size()]);
        return elemets;
    }
}
