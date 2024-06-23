package problems.java.hashmap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TwoSum1Test {

    TwoSum1 solution = new TwoSum1();


    @Test
    void example1(){

        int[] test = {2,7,11,15};

        int[] res = {0,1};

        assertThat(solution.twoSum(test,9)).isEqualTo(res);

    }

    @Test
    void example2(){

        int[] test = {3, 2, 4};

        int[] res = {1, 2};

        assertThat(solution.twoSum(test,6)).isEqualTo(res);

    }

    @Test
    void example3(){

        int[] test = {3, 3};

        int[] res = {0,1};

        assertThat(solution.twoSum(test,6)).isEqualTo(res);

    }

}