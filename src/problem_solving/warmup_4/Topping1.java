/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_4;

import java.util.HashMap;
import java.util.Map;

/**
 *
 Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present,
 set its value to "cherry". In all cases, set the key "bread" to have the value "butter".


 topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
 topping1({}) → {"bread": "butter"}
 topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
 * */
public class Topping1 {
    public Map<String, String> topping1(Map<String, String> map) {
        map.put("bread", "butter");
        if(map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        return map;
    }

    public static void main(String[] args) {
        Topping1 t = new Topping1();

        Map<String, String> test = new HashMap<>();
        test.put("ice cream", "peanuts");
        System.out.println(t.topping1(test));

        Map<String, String> test2 = new HashMap<>();
        System.out.println(t.topping1(test2));

        Map<String, String> test3 = new HashMap<>();
        test3.put("pancake", "syrup");
        System.out.println(t.topping1(test3));



    }
}
