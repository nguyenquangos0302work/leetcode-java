package _88;

/*
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * */

import java.util.Arrays;

public class _88_Merg_Sorte_Array {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        mergeNums2IntoNums1(nums1, nums2);
        sortNums1(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    private static void mergeNums2IntoNums1(int[] nums1, int[] nums2) {
        int indexNums2 = 0;
        for (int i = nums1.length - nums2.length; i < nums1.length; i++) {
            nums1[i] = nums2[indexNums2];
            indexNums2++;
        }
    }

    private static void sortNums1(int[] nums1) {
        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = i + 1; j < nums1.length; j++) {
                if (nums1[i] > nums1[j]) {
                    swap(nums1, i, j);
                }
            }
        }
    }

    private static void swap(int[] nums1, int i, int j) {
        int temp = nums1[i];
        nums1[i] = nums1[j];
        nums1[j] = temp;
    }

    public static void main(String[] args) {
        _88_Merg_Sorte_Array _88_Merg_Sorte_Array = new _88_Merg_Sorte_Array();
        _88_Merg_Sorte_Array.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{3, 0, 6}, 3);
    }

}
