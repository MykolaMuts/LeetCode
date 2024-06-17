package problems.java;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

class RansomNote383Test {


    RansomNote383 solution = new RansomNote383();

    @Test
    void example1() {

        String ransomNote = "a", magazine = "b";

        assertThat(solution.canConstruct(ransomNote, magazine)).isEqualTo(false);
    }

    @Test
    void example2() {

        String ransomNote = "aa", magazine = "ab";

        assertThat(solution.canConstruct(ransomNote, magazine)).isEqualTo(false);
    }

    @Test
    void example3() {

        String ransomNote = "aa", magazine = "aab";

        assertThat(solution.canConstruct(ransomNote, magazine)).isEqualTo(true);
    }
}