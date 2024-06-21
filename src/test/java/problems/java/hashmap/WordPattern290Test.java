package problems.java.hashmap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WordPattern290Test {

    WordPattern290 solution = new WordPattern290();

    @Test
    void example1() {

        String pattern = "abba", s = "dog cat cat dog";

        assertThat(solution.wordPattern(pattern, s)).isEqualTo(true);

    }

    @Test
    void example2() {

        String pattern = "abba", s = "dog cat cat fish";

        assertThat(solution.wordPattern(pattern, s)).isEqualTo(false);

    }

    @Test
    void example3() {

        String pattern = "aaaa", s = "dog cat cat dog";

        assertThat(solution.wordPattern(pattern, s)).isEqualTo(false);

    }

}