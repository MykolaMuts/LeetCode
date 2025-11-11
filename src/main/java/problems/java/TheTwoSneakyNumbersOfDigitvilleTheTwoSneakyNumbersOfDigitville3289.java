package problems.java;

import java.util.HashSet;

public class TheTwoSneakyNumbersOfDigitvilleTheTwoSneakyNumbersOfDigitville3289 {

    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        int index = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                result[index++] = num;
            } else {
                set.add(num);
            }
        }

        return result;
    }
}
