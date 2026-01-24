/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_2;
/**
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
 *
 *
 * stringBits("Hello") → "Hlo"
 * stringBits("Hi") → "H"
 * stringBits("Heeololeo") → "Hello"
 * */
public class StringBits {
    public String stringBits(String text){
        StringBuilder finalText = new StringBuilder();
        for (int i = 0; i < text.length(); i += 2){
           finalText.append(text.charAt(i));
        }
        return finalText.toString();
    }

    public static void main(String[] args) {
        StringBits sb = new StringBits();

        System.out.println(sb.stringBits("Hello"));
        System.out.println(sb.stringBits("Hi"));
        System.out.println(sb.stringBits("Heeololeo"));
    }

}
