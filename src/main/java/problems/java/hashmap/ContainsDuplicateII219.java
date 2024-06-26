package problems.java.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (numbers.containsKey(nums[i])) {
                int r = numbers.get(nums[i]);

                if (i - r <= k) {
                    return true;
                }
            }

            numbers.put(nums[i], i);

        }

        return false;

    }

    public boolean containsNearbyDuplicateHashMapCompute(int[] nums, int k) {

        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int index = i;
            int number = nums[i];

            if (-1 == numbers.compute(number, (key, val) ->
                    (val == null) ? index :
                            index - val <= k ? -1 : index)) {
                return true;
            }

        }

        return false;

    }

    public boolean containsNearbyDuplicateLeftRight(int[] nums, int k) {

        if (k == 0) {
            return false;
        }

        for (int left = 0; left < nums.length; left++) {
            for (int right = left + 1; right < nums.length; right++) {

                if (right - left <= k) {
                    if (nums[right] == nums[left]) {
                        return true;
                    }
                } else {
                    left++;
                    right = left;
                }

            }
        }

        return false;
    }

}
