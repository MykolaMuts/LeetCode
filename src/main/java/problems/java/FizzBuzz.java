package problems.java;

public class FizzBuzz {

    public static void main(String[] args) {

//        Write numbers from 1 to 100.
//        With exceptions:
//        if a current number is dividable by 3 - write "Fizz" instead of a number
//        if a current number is dividable by 5 - write "Buzz" instead of a number
//        if a current number is dividable by both 3 and 5 - write "FizzBuzz" instead of a number

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    if (i % 3 == 0) {
                        System.out.println("Fizz");
                    }
                    if (i % 5 == 0) {
                        System.out.println("Buzz");
                    }
                }
            } else {
                System.out.println(i);
            }
        }


    }

}
