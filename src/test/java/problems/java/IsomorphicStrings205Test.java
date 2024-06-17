package problems.java;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStrings205Test {

    IsomorphicStrings205 solution = new IsomorphicStrings205();

    @Test
    void example1() {

        String s = "egg", t = "add";

        assertThat(solution.isIsomorphic(s, t)).isEqualTo(true);
    }

    @Test
    void example2() {

        String s = "foo", t = "bar";

        assertThat(solution.isIsomorphic(s, t)).isEqualTo(false);

    }

    @Test
    void example3() {

        String s = "paper", t = "title";

        assertThat(solution.isIsomorphic(s, t)).isEqualTo(true);

    }

}