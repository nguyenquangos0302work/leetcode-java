package _1295;

/*
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * */

public class _1295_Find_Numbers_with_Even_Number_of_Digits {

    public int findNumbers(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int count = 0;
        for (int num : nums) {
            if (checkEvenNumberOfDigits(num)) {
                count++;
            }
        }
        return count;
    }

    private boolean checkEvenNumberOfDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(new _1295_Find_Numbers_with_Even_Number_of_Digits().findNumbers(new int[]{12, 345, 2, 6, 7896}));
        System.out.println(new _1295_Find_Numbers_with_Even_Number_of_Digits().findNumbers(new int[]{555, 901, 482, 1771}));
    }
}
