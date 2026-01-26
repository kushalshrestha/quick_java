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
 Modify and return the given map as follows: if the keys "a" and "b" are both in the map
 and have equal values, remove them both.


 mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
 mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
 mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
 * */
public class MapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map){
        if(map.containsKey("a") && map.containsKey("b") && map.get("a") == map.get("b")) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    public static void main(String[] args) {
        MapAB2 ma = new MapAB2();

        Map<String, String> m =new HashMap<>();
        m.put("a", "aaa");
        m.put("b", "aaa");
        m.put("c", "cake");

        System.out.println(ma.mapAB2(m));

        Map<String, String> m1 =new HashMap<>();
        m1.put("a", "aaa");
        m1.put("b", "bbb");

        System.out.println(ma.mapAB2(m1));

        Map<String, String> m2 =new HashMap<>();
        m2.put("a", "aaa");
        m2.put("b", "bbb");
        m2.put("c", "aaa");

        System.out.println(ma.mapAB2(m2));
    }
}
