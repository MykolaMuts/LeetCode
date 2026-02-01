package problems.java.twoPointer;

public class DivideAnArrayIntoSubarraysWithMinimumCostI3010 {

    public int minimumCost(int[] nums) {

        int result = nums[0];

        int firstMin = Math.min(nums[1], nums[2]);
        int secondMin = Math.max(nums[1], nums[2]);

        for (int i = 3; i < nums.length; i++) {
            if (nums[i] <= firstMin) {
                secondMin = firstMin;
                firstMin = nums[i];
            } else if (nums[i] <= secondMin) {
                secondMin = nums[i];
            }
        }

        result += firstMin + secondMin;

        return result;

    }

    public int minimumCostMaxIntegerValue(int[] nums) {
        int first = nums[0];
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < firstMin) {
                secondMin = firstMin;
                firstMin = nums[i];
            } else if (nums[i] < secondMin){
                secondMin = nums[i];
            }
        }

        return first + firstMin + secondMin;

    }
}
