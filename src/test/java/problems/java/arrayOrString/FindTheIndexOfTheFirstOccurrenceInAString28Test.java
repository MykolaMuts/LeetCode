package problems.java.arrayOrString;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindTheIndexOfTheFirstOccurrenceInAString28Test {

    FindTheIndexOfTheFirstOccurrenceInAString28 solution = new FindTheIndexOfTheFirstOccurrenceInAString28();

    @Test
    void example1() {

        String haystack = "rsasadbutsad";
        String needle = "sad";

        assertThat(solution.strStr(haystack, needle)).isEqualTo(3);

    }

    @Test
    void example2() {

        String haystack = "mississippi";
        String needle = "issipi";

        assertThat(solution.strStr(haystack, needle)).isEqualTo(-1);

    }

}