package problems.java.intervals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MergeIntervals56Test {

    MergeIntervals56 solution = new MergeIntervals56();

    @Test
    void example1() {

        int [][] intervals  = {{1,3}, {8,10}, {2,6}, {15,18}};
        int [][] result = {{1,6}, {8,10}, {15,18}};

        assertThat(solution.merge(intervals)).isEqualTo(result);

    }

    @Test
    void example2() {

        int [][] intervals  = {{1,4}, {4,5}};
        int [][] result = {{1, 5}};

        assertThat(solution.merge(intervals)).isEqualTo(result);

    }

}