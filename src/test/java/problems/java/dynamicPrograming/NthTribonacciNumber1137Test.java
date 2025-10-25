package problems.java.dynamicPrograming;

import org.junit.jupiter.api.Test;
import problems.java.StrangePrinter664;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NthTribonacciNumber1137Test {

    NthTribonacciNumber1137 solution = new NthTribonacciNumber1137();

    @Test
    void example1() {

        int value = 5;
        int result = 7;

        assertThat(solution.tribonacci(value)).isEqualTo(result);

    }

}