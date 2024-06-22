package problems.java.hashmap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GroupAnagrams49Test {

    GroupAnagrams49 solution = new GroupAnagrams49();

    @Test
    void example1(){

        String [] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> expectedOutput = new ArrayList<>(Arrays.asList(
                Arrays.asList("eat", "tea", "ate"),
                Arrays.asList("tan", "nat"),
                Arrays.asList("bat")
        ));

        assertThat(solution.groupAnagrams(strs)).isEqualTo(expectedOutput);

    }

    @Test
    void example2(){

        String [] strs = {""};

        List<List<String>> expectedOutput = new ArrayList<>(Arrays.asList(
                Arrays.asList("")
        ));

        assertThat(solution.groupAnagrams(strs)).isEqualTo(expectedOutput);

    }

}