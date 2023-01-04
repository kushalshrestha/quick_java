package quick_java_fpp.list_datastructure;

import java.util.*;

public class binarySearchAlgorithm {
    public static int binarySearchUsingIteration(int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;
        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (sortedArray[middle] == key) {
                index = middle;
                break;
            } else if (sortedArray[middle] < key) {
                low = middle + 1;
            } else if (sortedArray[middle] > key) {
                high = middle - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5};
        int key = 4;
        int index = binarySearchUsingIteration(sortedArray, 4, 0, sortedArray.length - 1);
        System.out.println(key + " found at index = " + index);

        List<String> myList = new ArrayList<>();
        myList.add("Messi");
        myList.add("Ronaldo");
        myList.add("Neymar");
        myList.add("Mbappe");
        myList.add("Haaland");

        System.out.println("Implementing an Iterator - using direct use");
        Iterator<String> itr = myList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Implementing an Iterator - using for each construct");
        for(String s : myList) {
            System.out.println(s);
        }

        System.out.println("Implementing an Iterator - using for each function - lambda expression");
        myList.forEach(System.out::println);

        int pos = Collections.binarySearch(myList, "Messi");
        System.out.println("Messi's current position (Before sorting) : " + pos);

        Collections.sort(myList);
        System.out.println("After Collections.sort : " + myList);

        int afterPosition = Collections.binarySearch(myList, "Messi");
        System.out.println("Messi's current position (After sorting) : " + afterPosition);
    }
}
