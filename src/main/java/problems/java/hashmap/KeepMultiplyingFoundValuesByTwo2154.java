package problems.java.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class KeepMultiplyingFoundValuesByTwo2154 {

    public int findFinalValue(int[] nums, int original) {
        while (found(nums, original)) {
            original *= 2;
        }
        return original;
    }

    public boolean found(int[] nums, int value) {
        for (int num : nums) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public int findFinalValueArray(int[] nums, int original) {
        int value = original;

        for (int i = 0; i < nums.length; i++) {
            for (int num : nums) {
                if (num == value) {
                    value += value;
                    break;
                }
            }
        }
        return value;
    }

    public int findFinalValueHashSet(int[] nums, int original) {
        HashSet<Integer> set = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));

        while (set.contains(original)) {
            original *= 2;
        }

        return original;
    }
}
