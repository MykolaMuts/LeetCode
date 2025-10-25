package problems.java;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculateMoneyInLeetcodeBank1716Test {


    CalculateMoneyInLeetcodeBank1716 solution = new CalculateMoneyInLeetcodeBank1716();


    @Test
    void example1() {

        int value = 4;
        int result = 10;

        assertThat(solution.totalMoney(value))
                .isEqualTo(result);

    }

    @Test
    void example2() {

        int value = 20;
        int result = 96;

        assertThat(solution.totalMoney(value))
                .isEqualTo(result);

    }
}