package problems.java;

import org.junit.jupiter.api.Test;
import problems.java._helper.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbers2Test {

    AddTwoNumbers2 solution = new AddTwoNumbers2();

    @Test
    void example1(){

        ListNode node1 = new ListNode(
                2, new ListNode(
                4, new ListNode(
                3)));


        ListNode node2 = new ListNode(
                5, new ListNode(
                6, new ListNode(
                4)));

        ListNode node3 = new ListNode(
                7, new ListNode(
                0, new ListNode(
                8)));

        assertThat(solution.addTwoNumbers(node1, node2)).isEqualTo(node3);

    }

    @Test
    void example2(){

        ListNode node1 = new ListNode(
                9);


        ListNode node2 = new ListNode(
                1, new ListNode(
                9, new ListNode(
                9, new ListNode(
                9, new ListNode(
                9, new ListNode(
                9, new ListNode(
                9, new ListNode(
                9, new ListNode(
                9, new ListNode(
                9))))))))));

        ListNode node3 = new ListNode(
                0, new ListNode(
                0, new ListNode(
                0, new ListNode(
                0, new ListNode(
                0, new ListNode(
                0, new ListNode(
                0, new ListNode(
                0, new ListNode(
                0, new ListNode(
                0, new ListNode(
                1)))))))))));

        assertThat(solution.addTwoNumbers(node1, node2)).isEqualTo(node3);

    }

}