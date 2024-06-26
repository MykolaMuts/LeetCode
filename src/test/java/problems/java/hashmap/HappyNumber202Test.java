package problems.java.hashmap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HappyNumber202Test {

    HappyNumber202 solution = new HappyNumber202();

    @Test
    void example1() {

        assertThat(solution.isHappy(219)).isEqualTo(true);

    }

    @Test
    void example2() {

        assertThat(solution.isHappy(2)).isEqualTo(false);

    }

}