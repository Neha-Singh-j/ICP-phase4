package ICP_2026.week_1;

import java.util.*;
public class Problem5 {
     public static void main(String[] args) {
        Problem5 obj = new Problem5();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median = obj.MedianOfArray(nums1, nums2);
        System.out.println(median);
    }
    public double MedianOfArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        int ptr1 = 0;
        int ptr2 = 0;

        // Merging two sorted arrays
        while (ptr1 < nums1.length && ptr2 < nums2.length) {
            if (nums1[ptr1] < nums2[ptr2]) { //when ptr1 value is less than ptr2
                al.add(nums1[ptr1]);
                ptr1++;
            } else {  //when ptr2 value is less
                al.add(nums2[ptr2]);
                ptr2++;
            }
        }

        while (ptr1 < nums1.length) {
            al.add(nums1[ptr1]);
            ptr1++;
        }

        while (ptr2 < nums2.length) {
            al.add(nums2[ptr2]);
            ptr2++;
        }

        int n = al.size();
        if (n % 2 == 1) { //odd length array
             return al.get(n / 2);
        } else {
            return (al.get(n / 2 - 1) + al.get(n / 2)) / 2.0;
        }
    } 

}
