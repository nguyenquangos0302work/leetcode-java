package _27;

/*
 * https://leetcode.com/problems/remove-element/
 */

public class _27_Remove_Element {
    public int removeElement(int[] nums, int val) {
        int arrayLength = nums.length;

        for (int i = 0; i < arrayLength;) {
            if (nums[i] == val) {
                pullEachElementInNumsToLeftFromIndexToN(nums, i, arrayLength);
                arrayLength--;
            } else {
                i++;
            }
        }

        return arrayLength;
    }

    private static void pullEachElementInNumsToLeftFromIndexToN(int[] nums, int i, int n) {
        for (int j = i; j < n - 1; j++) {
            nums[j] = nums[j + 1];
        }
    }

    public static void main(String[] args) {
        _27_Remove_Element _27_Remove_Element = new _27_Remove_Element();
        System.out.println(_27_Remove_Element.removeElement(new int[]{3, 2, 2, 3}, 2));
    }
}
