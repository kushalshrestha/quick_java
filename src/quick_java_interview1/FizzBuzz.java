/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_interview1;


@FunctionalInterface
interface CustomFunction <S, T> {
    T apply(S s);
}
public class FizzBuzz {
    protected String fizzBuzzCheck(Integer num){
        CustomFunction<Integer, String> f = (number) -> {
            if (number % 3 == 0 && number % 5 == 0) {
                return "FizzBuzz";
            } else if (number%3 == 0) {
                return "Fizz";
            } else if (number%5 == 0) {
                return "Buzz";
            } else {
                return number.toString();
            }
        };

        return f.apply(num);
    }

}

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        System.out.println("FizzBuzz Check for 9 is : " + fb.fizzBuzzCheck(9));
        System.out.println(fb.fizzBuzzCheck(15));
        System.out.println(fb.fizzBuzzCheck(30));
        System.out.println(fb.fizzBuzzCheck(32));

        check1to100();

    }

    public static void check1to100() {
        FizzBuzz fb = new FizzBuzz();
        for (int i = 1; i <=100 ; i++) {
            System.out.println("FizzBuzz Check for " + i + " is : " +fb.fizzBuzzCheck(i));
        }
    }
}




