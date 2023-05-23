/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_fpp.fundamental.nestedclasses;


/**
 * Outer Class : InnerClassExample
 * Inner Class : EvenIterator
 */
public class InnerClassComplexExample {
    // Create an array
    private final static int SIZE = 15;
    private final int[] arrayOfInts = new int[SIZE];
    //constructor
    public InnerClassComplexExample() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    interface DataStructureIterator extends java.util.Iterator<Integer> {}
    private class EvenIterator implements DataStructureIterator {
        // Start stepping through the array from the beginning
        private int nextIndex = 0;
        public boolean hasNext() {
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {
            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }
    public static void main(String[] s) {
        // Fill the array with integer values and print out only
        // values of even indices
        InnerClassComplexExample ds = new InnerClassComplexExample();
        ds.printEven();
    }
    public void printEven() {
        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}