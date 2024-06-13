package problems.java;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStockII122Test {

    BestTimeToBuyAndSellStockII122 solution = new BestTimeToBuyAndSellStockII122();





    @Test
    void example1() {

        int [] prices1 ={7,1,5,3,6,4};
        assertThat(solution.maxProfit(prices1)).isEqualTo(7);

    }

    @Test
    void example2() {

        int [] prices2 ={1,2,3,4,5};
        assertThat(solution.maxProfit(prices2)).isEqualTo(4);

    }

    @Test
    void example3() {

        int [] prices2 ={1, 5, 1, 5, 1, 5, 7};
        assertThat(solution.maxProfit(prices2)).isEqualTo(14);

    }
    @Test
    void example4() {

        int [] prices2 ={1, 3, 3, 3, 6, 4};
        assertThat(solution.maxProfit(prices2)).isEqualTo(5);

    }

}