package problems.java.twoPointer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DivideAnArrayIntoSubarraysWithMinimumCostI3010Test {


    DivideAnArrayIntoSubarraysWithMinimumCostI3010 solution = new DivideAnArrayIntoSubarraysWithMinimumCostI3010();

    @Test
    void example1() {

        int [] nums = {100,4,200,1,3,2};

        assertThat(solution.minimumCost(nums)).isEqualTo(103);

    }
}