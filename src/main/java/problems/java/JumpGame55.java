package problems.java;

import java.util.HashSet;
import java.util.Map;

public class JumpGame55 {

    public boolean canJump(int[] nums) {

        int left = 0;

        int right = -1;

        while (left + nums[left] < nums.length - 1) {

            right = findMax(nums, left);

            if(left == right){
                return false;
            }


            left = right;

        }

        return true; // if right can reach lastIndex - 1 or bigger
    }

    private int findMax(int[] nums, int left) {
        int max = 0;
        int maxIndex = left;

        for (int i = left+1; i <= left + nums[left]; i++) {
            if(nums[i] >= max){
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public boolean canJumpBack(int[] nums) {

        HashSet<Integer> alreadyJumpBack = new HashSet<>();

        int left = 0;

        int right;

        while (left + nums[left] < nums.length - 1) {

            right = left + nums[left]; // first go to max reachable index

            if (nums[right] == 0) {

                if (!alreadyJumpBack.add(left)) {
                    return false;
                } else {

                    right = jumpBack(nums, left, right);
                    if (right == -1) {
                        return false;
                    }

                }
            }

            left = right;

        }

        return true; // if right can reach lastIndex - 1 or bigger
    }

    private int jumpBack(int[] nums, int left, int right) {

        System.out.println("jump back form: " + left);

        int distance = 1;

        distance = nums[left] + nums[right];

        while (distance < nums[left]) {
            right = right - distance;

            if (right != 0) {
                return right;
            }

            distance++;

        }

        return -1;

    }

}
