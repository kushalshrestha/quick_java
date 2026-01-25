/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_3;

/**
 * Given a string, return the sum of the numbers appearing in the string,
 * ignoring all other characters. A number is a series of 1 or more digit chars in a row.
 * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
 * Integer.parseInt(string) converts a string to an int.)
 * <p>
 * <p>
 * sumNumbers("abc123xyz") → 123
 * sumNumbers("aa11b33") → 44
 * sumNumbers("7 11") → 18
 */
public class SumNumbers {
    public int sumNumbers(String text) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= text.length() - 1; i++) {
            Character c = text.charAt(i);
            Character nextCharacter = i == text.length() - 1 ? null : text.charAt(i + 1);

            if (Character.isDigit(c)) {
                sb.append(c);
            }

            if(!sb.isEmpty() && (nextCharacter == null || !Character.isDigit(nextCharacter))){
                sum += Integer.parseInt(sb.toString());
                sb.setLength(0);
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        SumNumbers sn = new SumNumbers();

        System.out.println(sn.sumNumbers("abc123xyz"));
        System.out.println(sn.sumNumbers("aa11b33"));
        System.out.println(sn.sumNumbers("7 11"));
    }
}
