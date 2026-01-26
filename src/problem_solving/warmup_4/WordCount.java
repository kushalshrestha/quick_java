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
 The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.


 wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
 wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
 wordCount(["c", "c", "c", "c"]) → {"c": 4}
 * */
public class WordCount {
    public Map<String, Integer> wordCount(String[] arr) {
        Map<String, Integer> m = new HashMap<>();
        for(String s: arr){
                m.put(s, m.getOrDefault(s, 0) + 1);
        }

        return m;
    }

    public static void main(String[] args) {
        WordCount wc = new WordCount();

        System.out.println(wc.wordCount(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println(wc.wordCount(new String[]{"c", "b", "a"}));
        System.out.println(wc.wordCount(new String[]{"c", "c", "c", "c"}));
    }
}
