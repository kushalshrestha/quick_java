/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_mpp.lesson9.ways_of_creating_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WaysOfCreatingStreams {
    public static void main(String[] args) {
        createFromCollection(); //creating a stream from collection
        createFromArray(); // creating a stream from an Array
        createFromStaticMethodOf(); // creating from static Method of()
        createFromSequenceOfArguments(); // creating from sequence of arguments


        creatingInfiniteStreamUsingGenerateAndIterate(); // creating Infinite Stream

    }

    private static void creatingInfiniteStreamUsingGenerateAndIterate() {
        /**
         * 1. Using Stream.generate()
         * */
        Stream<Double> infiniteStream = Stream.generate(Math::random);
//        infiniteStream.forEach(System.out::println); // don't use b/c it prints infinitely
        infiniteStream.limit(10).forEach(System.out::println);

        Stream<String> infiniteStream2 = Stream.generate(()->"Hello");
        infiniteStream2.limit(10).forEach(System.out::println);

        /**
         * 2. Using Stream.iterate()
         * */
        Stream<Integer> infiniteStream3 = Stream.iterate(5, n->n+5);
        infiniteStream3.limit(10).forEach(System.out::println);

        Stream<Integer> infiniteStream4 = Stream.iterate(5, n->n+5);
        infiniteStream4.skip(10).limit(10).forEach(System.out::println);


    }

    private static void createFromSequenceOfArguments() {
        Stream<String> stream = Stream.of("Arg1", "Arg2", "Arg3");
        stream.forEach(System.out::println);
    }

    private static void createFromStaticMethodOf() {
        Stream<String> stream = Stream.of("Apple", "Banana", "Orange");
        stream.forEach(System.out::println);

        Integer[] arrayOfInteger = {1,2,3,4};
        Stream<Integer> stream1 = Stream.of(arrayOfInteger);
        stream1.forEach(System.out::println);

        /** we cannot do this b/c we're trying to create Stream of primitive type.
         * Stream.of method is designed to work with reference types
         */
//        int[] arrayOfInteger3 = {5, 6, 7, 8};
//        Stream<int> stream3 = Stream.of(arrayOfInteger3);
//        stream3.forEach(System.out::println);

        // Instead you need to use this
        int[] arrayOfInteger2 = {1,2,3,4};
        IntStream stream2 =  IntStream.of(arrayOfInteger2);
        stream2.forEach(System.out::println);


    }

    private static void createFromArray() {
        String[] array = {"Apple", "Banana", "Orange"};
        Stream<String> stream = Arrays.stream(array);
        stream.forEach(System.out::println);
    }

    private static void createFromCollection() {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }

}
