package quick_java.lesson10.slidesDemo;

public class GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] testArray = new String[] { "apple", "ball", "cat", "dog", "apple" };
		System.out.println(GenericMethod.countOccurrences(testArray, null));
		String[] testArray2 = new String[] { "apple", "ball", "cat", "dog", "apple" };
		System.out.println(GenericMethod.genericCountOccurrences(testArray2, "apple"));
		
		
		Integer[] testArrayGeneric = new Integer[] { 1, 2, 3, 4, 1, 1, 1};
		System.out.println(GenericMethod.genericCountOccurrences(testArrayGeneric, 1));
		
//		int[] testArrayGeneric2 = new int[] { 1, 2, 3, 4, 1, 1, 1};
//		System.out.println(GenericMethod.genericCountOccurrences(testArrayGeneric2, 1)); //will give error

	}

	public static int countOccurrences(String[] arr, String target) {
		int count = 0;
		if (target == null) {
			for (String item : arr) {
				if (item == null) {
					count++;
				}
			}
		} else {
			for (String item : arr) {
				if (target.equals(item)) {
					count++;
				}
			}
		}
		return count;
	}
	
	//generic
	public static <T> int genericCountOccurrences(T[] arr, T target) {
		int count = 0;
		if (target == null) {
			for (T item : arr) {
				if (item == null) {
					count++;
				}
			}
		} else {
			for (T item : arr) {
				if (target.equals(item)) {
					count++;
				}
			}
		}
		return count;
	}

}
