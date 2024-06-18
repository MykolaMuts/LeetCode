package problems.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class SamsungTest {

    int a, b;

    Samsung solution = new Samsung();

    @Test
    void example1() {

        int [] A = {1, 3, 6, 4, 1, 2};

        assertThat(solution.solution(A)).isEqualTo(5);

    }

    @Test
    void example2() {

        int [] A = {1, 2, 3};

        assertThat(solution.solution(A)).isEqualTo(4);

    }

    @Test
    void example3() {

        int [] A = {-1, -3};

        assertThat(solution.solution(A)).isEqualTo(1);

    }


}