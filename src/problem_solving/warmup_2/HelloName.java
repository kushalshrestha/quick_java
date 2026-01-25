/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_2;
/**
 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
 *
 *
 * helloName("Bob") → "Hello Bob!"
 * helloName("Alice") → "Hello Alice!"
 * helloName("X") → "Hello X!"
 * */
public class HelloName {
    public String helloName(String name){
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        HelloName hn = new HelloName();
        System.out.println(hn.helloName("Bob"));
        System.out.println(hn.helloName("Alice"));
        System.out.println(hn.helloName("X"));
    }


}
