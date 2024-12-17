package _88;

/*
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * */

import java.util.Arrays;

public class _88_Merg_Sorte_Array_V1 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int num2 : nums2) {
            mergeNum2IntoNums1AndSortNums1FromBeginArrayToPositionM(num2, nums1, m);
            m++;
        }
        System.out.println(Arrays.toString(nums1));
    }

    private static void mergeNum2IntoNums1AndSortNums1FromBeginArrayToPositionM(int num2, int[] nums1, int m) {
        for (int i = 0; i < m; i++) {
            if (nums1[i] > num2) {
                pushEachElementInNums1ToRightFromIndexToPositionM(nums1, i, m);
                nums1[i] = num2;
                return;
            }
        }

        nums1[m] = num2;
    }

    private static void pushEachElementInNums1ToRightFromIndexToPositionM(int[] nums1, int i, int m) {
        for (int j = m - 1; j >= i; j--) {
            nums1[j + 1] = nums1[j];
        }
    }

    public static void main(String[] args) {
        _88_Merg_Sorte_Array_V1 _88_Merg_Sorte_Array = new _88_Merg_Sorte_Array_V1();
        _88_Merg_Sorte_Array.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{3, 0, 6}, 3);
    }

}
