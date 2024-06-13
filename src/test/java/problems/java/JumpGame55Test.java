package problems.java;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class JumpGame55Test {

    JumpGame55 solution = new JumpGame55();

    @Test
    void example1(){

        int [] num = {2,3,1,1,4};

        assertThat(solution.canJump(num)).isEqualTo(true);
    }

    @Test
    void example2(){

        int [] num = {3,2,1,0,4};

        assertThat(solution.canJump(num)).isEqualTo(false);
    }

    @Test
    void example3(){

        int [] num = {0};

        assertThat(solution.canJump(num)).isEqualTo(true);
    }

    @Test
    void example4(){

        int [] num = {1, 2, 3};

        assertThat(solution.canJump(num)).isEqualTo(true);
    }

    @Test
    void example5(){

        int [] num = {1, 1, 1, 0};

        assertThat(solution.canJump(num)).isEqualTo(true);
    }

    @Test
    void example6(){

        int [] num = {1,1,2,2,0,1,1};

        assertThat(solution.canJump(num)).isEqualTo(true);
    }

    @Test
    void example7(){

        int [] num = {4,2,0,0,1,1,4,4,4,0,4,0};

        assertThat(solution.canJump(num)).isEqualTo(true);
    }

}