package cs10_week2;

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {0, 0};
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();

        int[] result = new int[] {2, 7, 11, 15};
        int[] result2 = new int[] {3, 2, 4};
        int[] result3 = new int[] {3, 3};
        int target = 9;
        int target2 = 6;
        int target3 = 6;

        int[] a = ts.twoSum(result3, target3);
        System.out.println(Arrays.toString(a));
    }
}
