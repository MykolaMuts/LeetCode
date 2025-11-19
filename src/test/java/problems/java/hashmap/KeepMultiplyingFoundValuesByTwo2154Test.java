package problems.java.hashmap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KeepMultiplyingFoundValuesByTwo2154Test {
    KeepMultiplyingFoundValuesByTwo2154 solution = new KeepMultiplyingFoundValuesByTwo2154();


    @Test
    void example1() {

        int[] nums = {5, 3, 6, 1, 12};
        int original = 3;
        int result = 24;

        assertThat(solution.findFinalValue(nums, original)).isEqualTo(result);

    }

}