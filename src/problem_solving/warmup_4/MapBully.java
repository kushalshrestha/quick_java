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

 Modify and return the given map as follows: if the key "a" has a value,
 set the key "b" to have that value, and set the key "a" to have the value "". '
 Basically "b" is a bully, taking the
 value and replacing it with the empty string.


 mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
 mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
 mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 * */
public class MapBully {
    public static Map<String, String> mapBully(Map<String, String> map) {
        if(map.containsKey("a") && map.get("a").length() > 0) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }

        return map;
    }

    public static void main(String[] args) {
        Map<String, String> test1 = new HashMap<>();
        test1.put("a", "candy");
        test1.put("b", "dirt");

        Map<String, String> test2 = new HashMap<>();
        test2.put("a", "candy");

        Map<String, String> test3 = new HashMap<>();
        test3.put("a", "candy");
        test3.put("b", "carrot");
        test3.put("c", "meh");

        System.out.println(mapBully(test1)); // {a=, b=candy}
        System.out.println(mapBully(test2)); // {a=, b=candy}
        System.out.println(mapBully(test3)); // {a=, b=candy, c=meh}
    }
}
