package problems.java;

import java.util.Arrays;

public class Samsung {

    public int solution(int[] A) {

        int min = 0;

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {

            if(A[i] - 1 == min || A[i] == min){
                min = A[i];
            } else {
                break;
            }

        }

        return min+1;
    }

}
