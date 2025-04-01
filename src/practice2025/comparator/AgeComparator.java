/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package practice2025.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
//        if (p1.getAge() > p2.getAge()) return 1;
//        else if (p1.getAge() < p2.getAge()) return -1;
//        else return 0;

        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
