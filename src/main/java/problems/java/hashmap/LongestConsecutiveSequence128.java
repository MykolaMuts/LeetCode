package problems.java.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class LongestConsecutiveSequence128 {

    public int longestConsecutiveSlow(int[] nums) {

//        HashMap <Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i],i);
//        }

        int[] sorted = Arrays.stream(nums).sorted().toArray();

        int counter = 1;

        int max = 0;

        for (int i = 0; i < sorted.length - 1; i++) {

            if (sorted[i + 1] > sorted[i]) {
                counter++;
                max = Math.max(max, counter);
            } else {
                counter = 1;
            }

        }

        return max;

    }

    public int longestConsecutive(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, 1);
        }

        int max = 0;
        int sequence;

        for (Integer value : map.keySet()) {

            sequence = longestConsecutiveHelper(map, value, 1);

            map.put(value, sequence);

            max = Math.max(max, sequence);
        }

        return max;

    }

    public int longestConsecutiveHelper(HashMap<Integer, Integer> map, int value, int sequence) {

        if (map.containsKey(value - 1)) {
            if (map.get(value - 1) != 1) {
                sequence += map.get(value - 1);
            } else {
                sequence = longestConsecutiveHelper(map, value - 1, sequence + 1);
            }
        }
        return sequence;
    }
}
