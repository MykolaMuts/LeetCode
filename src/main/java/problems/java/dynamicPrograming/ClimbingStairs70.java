package problems.java.dynamicPrograming;

public class ClimbingStairs70 {

    public int climbStairs(int n) {

        if(n < 3){
            return n;
        }

        int first = 2;
        int second = 1;

        for (int i = 3; i <= n; i++) {
            int res = first + second;
            second = first;
            first = res;
        }

        return first;
    }

    public int climbStairsRec(int n) {

        if(n < 3){
            return n;
        }
        return climbStairsRec(n - 2) + climbStairsRec(n - 1);
    }

    public int climbStairsWrong(int n) {

        int div = n / 2;

        int isOdd = n % 2;

        int res = 2;

        if (isOdd == 1) {
            res -= 1;
        }

        for (int i = 2; i < div + isOdd; i++) {
            res += fibo(n - i, n - i - i);
        }

        return res;
    }

    private int fibo(int from, int to) {

        int res = 1;
        do {
            res *= from;
            from--;

        } while (from != to);

        return res;
    }
}
