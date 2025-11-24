package problems.java.bitManipulation;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BinaryPrefixDivisibleByFive1018Test {

    BinaryPrefixDivisibleByFive1018 solution = new BinaryPrefixDivisibleByFive1018();

    @Test
    void example1() {

        int[] num = {1, 0, 1};
        List<Boolean> result = List.of(false, false, true);

        assertThat(solution.prefixesDivBy5(num)).isEqualTo(result);
    }

    @Test
    void example2() {

        int[] num = {1, 1, 1, 1};
        List<Boolean> result = List.of(false, false, false, true);

        assertThat(solution.prefixesDivBy5(num)).isEqualTo(result);
    }

    @Test
    void example3() {

        int[] num = {1, 1, 0, 0, 0, 1, 0, 0, 1};
        List<Boolean> result = List.of(false, false, false, false, false, false, false, false, false);

        assertThat(solution.prefixesDivBy5(num)).isEqualTo(result);
    }

    @Test
    void example4() {

        int[] num = {1, 0, 1, 1, 1, 1, 1};
        List<Boolean> result = List.of(false, false, true, false, false, false, true);

        assertThat(solution.prefixesDivBy5(num)).isEqualTo(result);
    }

     @Test
    void example5() {

        int[] num = {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
        List<Boolean> result = List.of(false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,true,false,false,false,true,false);

        assertThat(solution.prefixesDivBy5(num)).isEqualTo(result);
    }


}