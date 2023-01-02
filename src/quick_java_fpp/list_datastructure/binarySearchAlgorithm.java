package quick_java_fpp.list_datastructure;

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
    }
}
