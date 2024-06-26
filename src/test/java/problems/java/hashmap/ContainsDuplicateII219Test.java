package problems.java.hashmap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateII219Test {

    ContainsDuplicateII219 solution = new ContainsDuplicateII219();

    @Test
    void example1() {

        int [] nums = {1,2,3,1};

        int k = 3;

        assertThat(solution.containsNearbyDuplicate(nums, k)).isEqualTo(true);

    }

    @Test
    void example2() {

        int [] nums = {1, 0, 1, 1};

        int k = 1;

        assertThat(solution.containsNearbyDuplicate(nums, k)).isEqualTo(true);

    }

    @Test
    void example3() {

        int [] nums = {1,2,3,1,2,3};

        int k = 2;

        assertThat(solution.containsNearbyDuplicate(nums, k)).isEqualTo(false);

    }

    @Test
    void example4() {

        int [] nums = {1,2,3,4,5,6,7,8,9,9};

        int k = 3;

        assertThat(solution.containsNearbyDuplicate(nums, k)).isEqualTo(true);

    }

}