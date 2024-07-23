package problems.java.intervals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SummaryRanges228Test {

    SummaryRanges228 solution = new SummaryRanges228();

    @Test
    void example1() {

        int [] prices1 ={0,1,2,4,5,7};

        String [] result = {"0->2","4->5","7"};

        List<String> res = Arrays.stream(result).toList();

        assertThat(solution.summaryRanges(prices1)).isEqualTo(res);

    }

}