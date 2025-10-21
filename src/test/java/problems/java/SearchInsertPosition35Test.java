package problems.java;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPosition35Test {

    SearchInsertPosition35 solution = new SearchInsertPosition35();


    @Test
    void example1() {

        int[] nums = {1, 3, 5, 6, 7, 9, 22, 44, 75};
        int value = 8;
        int result = 5;

        assertThat(solution.searchInsert(nums, value)).isEqualTo(result);

    }
}