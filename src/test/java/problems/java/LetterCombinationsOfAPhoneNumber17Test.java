package problems.java;

import org.junit.jupiter.api.Test;
import problems.java.hashmap.TwoSum1;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsOfAPhoneNumber17Test {

    LetterCombinationsOfAPhoneNumber17 solution = new LetterCombinationsOfAPhoneNumber17();


    @Test
    void example1(){

        List<String> result = new ArrayList<>();

        assertThat(solution.letterCombinations("")).isEqualTo(result);

    }

    @Test
    void example2(){

        String[] res = {"a","b","c"};

        List<String> result = List.of(res);

        assertThat(solution.letterCombinations("2")).isEqualTo(result);

    }

    @Test
    void example3(){

        String[] res = {"ad","ae","af","bd","be","bf","cd","ce","cf"};

        List<String> result = List.of(res);

        assertThat(solution.letterCombinations("23")).isEqualTo(result);

    }

    @Test
    void example4(){

        String[] res = {"adg","adh","adi","aeg","aeh","aei","afg","afh","afi","bdg","bdh","bdi","beg","beh","bei","bfg","bfh","bfi","cdg","cdh","cdi","ceg","ceh","cei","cfg","cfh","cfi"};

        List<String> result = List.of(res);

        assertThat(solution.letterCombinations("234")).isEqualTo(result);

    }



}