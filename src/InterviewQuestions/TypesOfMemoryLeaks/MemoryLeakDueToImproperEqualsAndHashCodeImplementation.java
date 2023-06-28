/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewQuestions.TypesOfMemoryLeaks;

import java.util.HashMap;
import java.util.Map;

/**
 * When HashSet and HashMap use these methods like equals() and hashCode() methods but not overridden correctly, they
 * can become a source for potential memory leak problems
 */
public class MemoryLeakDueToImproperEqualsAndHashCodeImplementation {
    public static void main(String[] args) {
        improperCode();
        properCode();

    }

    private static void properCode() {
        Map<PersonWithProperHashCodeAndEquals, Integer> map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(new PersonWithProperHashCodeAndEquals("Kushal"), 1);
        }
        System.out.println("The size of Map when improper hashcode done is : " + map.size());
    }

    private static void improperCode() {
        Map<PersonWithImproperHashCodeAndEquals, Integer> map = new HashMap<>();
        for (int i = 0; i < 100; i++) {
            map.put(new PersonWithImproperHashCodeAndEquals("Kushal"), 1);
        }
        System.out.println("The size of Map when proper hashcode and equals method is implemented : " + map.size());
    }
}

class PersonWithImproperHashCodeAndEquals {
    public String name;

    public PersonWithImproperHashCodeAndEquals(String name) {
        this.name = name;
    }
}

class PersonWithProperHashCodeAndEquals {
    public String name;

    public PersonWithProperHashCodeAndEquals(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof PersonWithProperHashCodeAndEquals person)) {
            return false;
        }
        return person.name.equals(name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        return result;
    }
}
