package problems.java.dynamicPrograming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GreatestSumDivisibleByThree1262Test {

    GreatestSumDivisibleByThree1262 solution = new GreatestSumDivisibleByThree1262();

    @Test
    void example1(){

        int [] num = {2,6,2,2,7};
        int result = 15;

        assertThat(solution.maxSumDivThree(num)).isEqualTo(result);
    }

    @Test
    void example2(){

        int [] num = {4};
        int result = 0;

        assertThat(solution.maxSumDivThree(num)).isEqualTo(result);
    }

    @Test
    void example3(){

        int [] num = {3,6,5,1,8};
        int result = 18;

        assertThat(solution.maxSumDivThree(num)).isEqualTo(result);
    }

}