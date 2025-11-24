package problems.java.bitManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryPrefixDivisibleByFive1018 {

    public List<Boolean> prefixesDivBy5(int[] nums) {
        Boolean[] res = new Boolean[nums.length];
        int prefix = 0;
        for (int i = 0; i < nums.length; i++) {
            prefix = ((prefix << 1) + nums[i]) % 5;
            res[i] = prefix == 0;
        }
        return Arrays.asList(res);
    }

    public List<Boolean> prefixesDivBy5ArrayList(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int prefix = 0;
        for (int num : nums) {
            prefix = ((prefix << 1) + num) % 5;
            result.add(prefix == 0);
        }
        return result;
    }

    public List<Boolean> prefixesDivBy5Long(int[] nums) {

        List<Boolean> result = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            long sum = 0;
            for (int j = 0; j < nums.length - i; j++) {
                sum += nums[j] == 1 ? (long) Math.pow(2, nums.length - j - i) : 0;
            }
            result.addFirst(sum % 5 == 0);
        }
        return result;
    }

}
