package problems.java.intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {

    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        int right;

        for (int left = 0; left < nums.length; left++) {
            for (right = left; right < nums.length-1; right++) {

//                int a = nums[right];
//                int b = nums[right+1];

                if (nums[right] + 1 != nums[right+1]) {
                    break;
                }
            }

            if(left != right){
                result.add(nums[left] + "->" + nums[right]);
            } else{
                result.add(String.valueOf(nums[left]));
            }

            left = right;
        }
        return result;
    }

}
