/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_2;

/**
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 * <p>
 * <p>
 * stringTimes("Hi", 2) → "HiHi"
 * stringTimes("Hi", 3) → "HiHiHi"
 * stringTimes("Hi", 1) → "Hi"
 */
public class StringTimes {
    public String stringTimes(
            String a,
            int n
    ) {
        if (n < 1)
            return "Error";
        String finalText = "";
        for (int i = 0; i < n; i++) {
            finalText += a;
        }
        return finalText;
    }

    // avove process creates many temporary String objects because String is immutable
    public String stringTimesOptimized(
            String a,
            int n
    ) {
        StringBuilder finalText = new StringBuilder();
        for (int i = 0; i < n; i++) {
            finalText.append(a);
        }
        return finalText.toString();
    }

    public static void main(String[] args) {
        StringTimes st = new StringTimes();

        System.out.println(st.stringTimes("Hi", 2));
        System.out.println(st.stringTimes("Hi", 3));
        System.out.println(st.stringTimes("Hi", 1));

        System.out.println(st.stringTimesOptimized("Hi", 2));
        System.out.println(st.stringTimesOptimized("Hi", 3));
        System.out.println(st.stringTimesOptimized("Hi", 1));
    }
}
