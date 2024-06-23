package problems.java.hashmap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class TwoSum1 {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> maps = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if(maps.containsKey(target - nums[i])){
                if(nums[i] * 2 == target){
                    return new int[]{maps.get(nums[i]), i};
                }
            }

            maps.put(target - nums[i], i);

        }

        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            if (maps.containsKey(target-entry.getKey())) {
                return new int[]{maps.get(target-entry.getKey()), entry.getValue()};
            }

        }

        return new int[]{0, 0};

    }

    public int[] twoSumWrong(int[] nums, int target) {

        HashMap<Integer, Integer> maps = new HashMap<>();

        for (int num : nums) {

            maps.put(num, target - num);

        }

        for (Integer value : maps.values()) {
            if (maps.containsKey((value))) {
                return new int[]{target-value, value};
            }
        }

        return new int[]{0, 0};


    }

    public int[] twoSumLeftAndRight(int[] nums, int target) {

        int left = 0;
        int right;

        for (right = left + 1; right < nums.length; right++) {
            if (nums[left] + nums[right] == target) {
                break;
            }
            if (right == nums.length - 1) {
                left++;
                right = left;
            }


        }

        return new int[]{left, right};

    }

    public int[] twoSumStream(int[] nums, int target) {
        int[] twoSum = new int[2];
        for (int i = 0; i < nums.length; i++) {
            final int index = i;
            int oneSum = nums[index];
            int lookingSum = target - oneSum;
            OptionalInt nextSum = IntStream.range(0, nums.length)
                    .filter(value -> value != index && nums[value] == lookingSum)
                    .findFirst();

            if (nextSum.isPresent()) {
                twoSum[0] = i;
                twoSum[1] = nextSum.getAsInt();
            }

        }
        return twoSum;
    }


}