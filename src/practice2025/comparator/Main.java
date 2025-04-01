/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package practice2025.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Person[] personList = {new Person("Kushal", 31), new Person("Messi", 34), new Person("Andriy", 37)};
        Arrays.sort(personList, new NameComparator());
        System.out.println("1. Sorting in ascending order (using NameComparator");
        System.out.println(Arrays.toString(personList));


        System.out.println("2. Alternative way - lambda expression");
        Comparator<Person> comparator = (p1, p2) -> {
            return p1.getName().compareTo(p2.getName());
        };
        Arrays.sort(personList, comparator);
        System.out.println(Arrays.toString(personList));

        System.out.println("3. Alternative way - Anonymous inner class");
        Arrays.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2){
                return p1.getName().compareTo(p2.getName());
            }
        });
        System.out.println(Arrays.toString(personList));

        System.out.println("4. Alternative way - Anonymous inner class as lambda");
        Arrays.sort(personList, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println(Arrays.toString(personList));


        System.out.println("=========================");
        Arrays.sort(personList, new AgeComparator());
        System.out.println(Arrays.toString(personList));
    }
}
