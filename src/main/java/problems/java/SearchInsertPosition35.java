package problems.java;

public class SearchInsertPosition35 {

    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i <= nums.length; i++) {
            int j = nums.length - i - 1;

            if (target <= nums[i]) {
                return i;
            }

            if (target == nums[j]) {
                return j;
            } else if (target > nums[j]) {
                return j + 1;
            }
        }
        return 0;
    }

}
