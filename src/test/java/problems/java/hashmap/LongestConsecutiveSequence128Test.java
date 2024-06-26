package problems.java.hashmap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequence128Test {

    LongestConsecutiveSequence128 solution = new LongestConsecutiveSequence128();

    @Test
    void example1() {

        int [] nums = {100,4,200,1,3,2};

        assertThat(solution.longestConsecutive(nums)).isEqualTo(4);

    }

    @Test
    void example2() {

        int [] nums = {0,3,7,2,5,8,4,6,0,1};

        assertThat(solution.longestConsecutive(nums)).isEqualTo(9);

    }

}