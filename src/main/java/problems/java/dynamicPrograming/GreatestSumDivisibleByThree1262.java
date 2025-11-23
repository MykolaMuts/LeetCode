package problems.java.dynamicPrograming;

import java.util.Arrays;

public class GreatestSumDivisibleByThree1262 {

    public int maxSumDivThree(int[] nums) {

        int[] sorted = Arrays.stream(nums).sorted().toArray();

        int sum = Arrays.stream(nums).sum();

        int searchMod = sum % 3;
        int maxOneSum = 0;
        int maxTwoSum = 0;

        if (searchMod == 0) {
            return sum;
        }

        for (int i = 0; i < sorted.length; i++) {
            int firstMod = sorted[i] % 3;

            switch (firstMod % 3) {
                case 0:
                    continue;
                case 1:
                    if (firstMod == searchMod) {
                        return sum - sorted[i];

                    } else {

                        for (int j = i + 1; j < sorted.length; j++) {
                            int secondMod = sorted[j] % 3;
                            if (secondMod == 1) {
                                maxTwoSum = Math.max(maxTwoSum, sum - sorted[i] - sorted[j]);
                            } else if (secondMod == 2) {
                                maxOneSum = Math.max(maxOneSum, sum - sorted[j]);
                            }

                            if (maxOneSum != 0 && maxTwoSum != 0) {
                                break;
                            }

                        }
                        return Math.max(maxOneSum, maxTwoSum);
                    }
                case 2:
                    if (firstMod == searchMod) {
                        return sum - sorted[i];
                    } else {

                        for (int j = i + 1; j < sorted.length; j++) {
                            int secondMod = sorted[j] % 3;
                            if (secondMod == 2) {
                                maxTwoSum = Math.max(maxTwoSum, sum - sorted[i] - sorted[j]);
                            } else if (secondMod == 1) {
                                maxOneSum = Math.max(maxOneSum, sum - sorted[j]);
                            }

                            if (maxOneSum != 0 && maxTwoSum != 0) {
                                break;
                            }

                        }
                        return Math.max(maxOneSum, maxTwoSum);
                    }
            }
        }

        return 0;
    }

    public int maxSumDivThreeTimeLimit(int[] nums) {

        int sum = Arrays.stream(nums).sum();

        int searchMod = sum % 3;

        if (searchMod == 0) {
            return sum;
        }

        int maxSum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 3 == 0) {
                continue;
            }

            if ((sum - nums[i]) % 3 == 0) {
                maxSum = Math.max(maxSum, sum - nums[i]);
            }

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] % 3 == 0) {
                    continue;
                }

                if ((sum - nums[i] - nums[j]) % 3 == 0) {
                    maxSum = Math.max(maxSum, sum - nums[i] - nums[j]);
                }
            }
        }


        return maxSum;
    }

    public int maxSumDivThreeOrder(int[] nums) {

        int[] sorted = Arrays.stream(nums).sorted().toArray();
        int sum = Arrays.stream(sorted).sum();

        int start = 0;

        if (sum % 3 == 0) {
            return sum;
        }

        while (start < sorted.length) {

            if (sorted[start] % 3 == 0) {
                continue;
            }

            int sumWithoutOne = sum - sorted[start];

            if (sumWithoutOne == 0) {
                return 0;
            }

            if (sumWithoutOne % 3 == 0) {
                return sum;
            } else {
                if (start + 1 < sorted.length) {
                    int sumWithoutTwo = sumWithoutOne - sorted[start + 1];

                    if (sumWithoutTwo == 0) {
                        return 0;
                    }

                    if (sumWithoutTwo % 3 == 0) {
                        return sumWithoutTwo;
                    }
                }
            }
            start++;
        }

        return 0;
    }

    public int maxSumDivThreeArrayStart(int[] nums) {

        int[] sorted = Arrays.stream(nums).sorted().toArray();

        int start = 0;

        while (start < sorted.length) {
            int sum = Arrays.stream(sorted, start, sorted.length).sum();

            if (sum % 3 == 0) {
                return sum;
            } else {
                sum -= sorted[start];
            }
            start++;
        }

        return 0;
    }

    public int maxSumDivThreeSofia(int[] nums) {

        int sum = Arrays.stream(nums).sum();

        int searchNum = sum % 3;

        if (sum == 0 || searchNum == 0) {
            return sum;
        }

        while (searchNum < sum) {
            for (int num : nums) {
                if (searchNum == num) {
                    sum -= searchNum;
                    return sum;
                }
            }
            searchNum += 3;

        }

        return 0;
    }
}
