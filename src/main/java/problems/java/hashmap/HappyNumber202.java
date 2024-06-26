package problems.java.hashmap;

import java.util.HashMap;

public class HappyNumber202 {

    public boolean isHappy(int n) {

        HashMap<Integer, Boolean> numbers = new HashMap<>();

        if (n == 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        while (n != 1) {
            int sum = 0;

            while (n>0){
                sum += (n % 10)*(n % 10);
                n = n/10;
            }

            if (!numbers.containsKey(sum)) {
                numbers.put(sum, true);
            } else return false;

            n = sum;
        }
        return true;
    }

}
