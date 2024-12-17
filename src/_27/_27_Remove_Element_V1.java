package _27;

/*
 * https://leetcode.com/problems/remove-element/
 */

public class _27_Remove_Element_V1 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        _27_Remove_Element_V1 _27_Remove_Element = new _27_Remove_Element_V1();
        System.out.println(_27_Remove_Element.removeElement(new int[]{3, 2, 2, 3}, 2));
    }
}
