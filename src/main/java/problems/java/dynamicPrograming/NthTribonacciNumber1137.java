package problems.java.dynamicPrograming;

import java.util.HashMap;

public class NthTribonacciNumber1137 {

    public int tribonacci(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        int first = 0;
        int second = 1;
        int third = 1;

        for (int i = 0; i < n - 2; i++) {
            int fourth = first + second + third;
            first = second;
            second = third;
            third = fourth;
        }
        return third;

    }

    public int tribonacciWrongForN25(int n) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(5, 7);
        map.put(4, 4);
        map.put(3, 2);
        map.put(2, 1);
        map.put(1, 1);
        map.put(0, 0);
        map.put(-1, 0);
        map.put(-2, 0);

        for (int i = 6; i <= n; i++) {

            int res = map.get(i - 1) +
                    2 * map.get(i - 2) +
                    3 * map.get(i - 3) +
                    2 * map.get(i - 4) +
                    map.get(i - 5);

            map.put(i, res);
        }

        return map.get(n);
    }

    public int tribonacciRec(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }

        return tribonacciRec(n - 3) +
                tribonacciRec(n - 2) +
                tribonacciRec(n - 1);

    }
}
