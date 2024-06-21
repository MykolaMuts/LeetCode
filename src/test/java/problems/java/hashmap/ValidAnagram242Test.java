package problems.java.hashmap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ValidAnagram242Test {

    ValidAnagram242 solution = new ValidAnagram242();

    @Test
    void example1(){

        String s = "anagram";

        String t = "nagaram";

        assertThat(solution.isAnagram(s,t)).isEqualTo(true);

    }

    @Test
    void example2(){

        String s = "rat";

        String t = "car";

        assertThat(solution.isAnagram(s,t)).isEqualTo(false);

    }

    @Test
    void example3(){

        String s = "aacc";

        String t = "ccac";

        assertThat(solution.isAnagram(s,t)).isEqualTo(false);

    }


}