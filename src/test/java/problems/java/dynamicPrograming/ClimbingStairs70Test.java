package problems.java.dynamicPrograming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairs70Test {

    ClimbingStairs70 solution = new ClimbingStairs70();

    @Test
    void example1() {

        int value = 5;
        int result = 8;

        assertThat(solution.climbStairs(value)).isEqualTo(result);

    }

}