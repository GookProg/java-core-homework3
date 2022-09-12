package homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Task2
 * [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
 */

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[] { 3, 4, 2, 7 };
        int target = 10;

        int[] pair = twoSum(array, target);
        System.out.println(Arrays.toString(pair));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        if (nums == null || nums.length < 2) {
            System.out.println("Массив не может содержать меньше двух элементов!");
            return new int[] { };
        }

        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];

            if (seen.containsKey(remaining)) {
                return new int[] { remaining, nums[i] };
            }
            seen.put(nums[i], i);
        }

        return new int[] { };
    }
}
