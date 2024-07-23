package problems.java.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals56 {

    public int[][] merge(int[][] intervals) {

        List<int[]> intervalList = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int left;
        int right;

        for (left = 0; left < intervals.length; left++) {

            int max = intervals[left][1];

            for (right = left; right < intervals.length-1; right++) {
                if (max < intervals[right+1][0]) {
                    break;
                }
                max = Math.max(max, intervals[right+1][1]);
            }

            int[] res = {intervals[left][0],max};
            intervalList.add(res);

            left = right;
        }
        return intervalList.toArray(new int[intervalList.size()][]);
    }

    public int[][] mergeIfSorted(int[][] intervals) {

        List<int[]> intervalList = new ArrayList<>();

        int left;
        int right;

        for (left = 0; left < intervals.length; left++) {
            for (right = left; right < intervals.length-1; right++) {

                if (intervals[left][1] < intervals[right+1][0]) {
                    break;
                }
            }

            int[] res = {intervals[left][0], intervals[right][1]};

            intervalList.add(res);

            left = right;
        }

        return intervalList.toArray(new int[intervalList.size()][]);
    }
}
