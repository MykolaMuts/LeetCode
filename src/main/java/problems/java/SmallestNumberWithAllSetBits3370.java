package problems.java;


public class SmallestNumberWithAllSetBits3370 {
    public int smallestNumber(int n) {
        int size = 0;
        int result = 0;


        for (int i = 0; i < n; i++) {
            if (n >= Math.pow(2, i) && n < Math.pow(2, i + 1)) {
                size = i;
                break;
            }
        }

        for (int i = 0; i <= size; i++) {
            result += (int) Math.pow(2, i);
        }

        return result;
    }
}
