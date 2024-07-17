package problems.java.arrayOrString;

public class GasStation134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int sumCost = 0;
        for (int c : cost) {
            sumCost += c;
        }
        int sumGas = 0;
        for (int g : gas) {
            sumGas += g;
        }
        if (sumCost > sumGas) {
            return -1;
        }

        int gasTank = 0;
        int left = 0;

        for (int right = left; right < gas.length; right++) {
            gasTank += gas[right] - cost[right];
            if(gasTank < 0){
                gasTank = 0;
                left = right+1;
            }
        }

        return left;
    }

    public int canCompleteCircuitSlow(int[] gas, int[] cost) {

        for (int left = 0; left < gas.length; left++) {
            if (gas[left] >= cost[left]) {

                int gasTank = gas[left];

                for (int right = left + 1; ; right++) {

                    int prevRight = right - 1;

                    if (right > gas.length - 1) {
                        right = 0;
                        prevRight = gas.length - 1;
                    }

                    gasTank -= cost[prevRight];

                    if (gasTank < 0) {
                        break;
                    }

                    gasTank += gas[right];

                    if (right == left) {
                        return left;
                    }

                }

            }

        }
        return -1;
    }

}
