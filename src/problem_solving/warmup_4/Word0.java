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
 * Given an array of strings, return a Map<String, Integer> containing a key for
 * every different string in the array, always with the value 0. For example the string "hello"
 * makes the pair "hello":0. We'll do more complicated counting later,
 * but for this problem the value is simply 0.
 *
 *
 * word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
 * word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
 * word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
 * */
public class Word0 {
    public Map<String, Integer> word0(String[] map){
        Map<String, Integer> m = new HashMap<>();
        for(String s : map){
            if(!m.containsKey(s)){
                m.put(s, 0);
            }
        }

//        for(String s : m.keySet()){
//            if(!m.containsKey(s)){
//                m.put("s", 0);
//            }
//        }

        return m;

    }

    public static void main(String[] args){
        Word0 w = new Word0();

        System.out.println(w.word0(new String[]{"a", "b", "a", "b"}));
        System.out.println(w.word0(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(w.word0(new String[]{"c", "b", "a"}));

    }
}

