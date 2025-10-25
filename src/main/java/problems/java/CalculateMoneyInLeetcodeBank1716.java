package problems.java;

public class CalculateMoneyInLeetcodeBank1716 {

    public int totalMoney(int n) {
        int weeks = n / 7;
        int remainWeekDays = n;
        if (weeks != 0) {
            remainWeekDays = n % 7;
        }

        int amountPerWeekWithoutPercents = factorialSum(7);

        int result = weeks * amountPerWeekWithoutPercents + factorialSum(remainWeekDays) + remainWeekDays * weeks;


        if (weeks > 1) {
            result += factorialSum(weeks - 1) * 7;
        }

        return result;
    }

    public int factorialSum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + factorialSum(n - 1);
    }

}
