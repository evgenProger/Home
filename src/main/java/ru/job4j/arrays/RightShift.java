package ru.job4j.arrays;

public class RightShift {
    public static void shift(int[] num, int count) {
        while (count > 0) {
            shift(num);
            count--;
        }
    }

    private static void shift(int[] nums) {
         int tmp = nums[nums.length - 1];
         int count = 0;
         int end = nums.length - 1;
         int previous_end = nums.length - 2;
        while (count < nums.length - 1) {
            nums[end] = nums[previous_end];
            end--;
            previous_end--;
            count++;
        }
        nums[0] = tmp;
    }

}
