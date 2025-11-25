package problems.java;

import java.util.HashMap;

public class SmallestIntegerDivisibleByK1015 {
    public int smallestRepunitDivByK(int k) {
        if(k % 2 == 0 || k % 5 == 0){
            return -1;
        }

        int number = 0;

        for(int i = 1; i <= k; i++){
            number = (number * 10 + 1) % k;
            if(number == 0) {
                return i;
            }
        }
        return -1;
    }
}
