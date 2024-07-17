package problems.java.arrayOrString;

import org.junit.jupiter.api.Test;
import problems.java.hashmap.WordPattern290;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GasStation134Test {

    GasStation134 solution = new GasStation134();

    @Test
    void example1() {

        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        assertThat(solution.canCompleteCircuit(gas,cost)).isEqualTo(3);

    }

    @Test
    void example2() {

        int[] gas = {2,3,4};
        int[] cost = {3,4,3};

        assertThat(solution.canCompleteCircuit(gas,cost)).isEqualTo(-1);

    }

}