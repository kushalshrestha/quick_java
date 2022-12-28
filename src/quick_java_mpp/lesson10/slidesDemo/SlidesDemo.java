package quick_java_mpp.lesson10.slidesDemo;

import java.util.ArrayList;
import java.util.List;

public class SlidesDemo {

	public static <T> void main(String[] args) {
		// Slide 4
		List words = new ArrayList();
		words.add("Hello");
		words.add(" world!");
		String s = (String) words.get(0) + words.get(1);
		System.out.println(s);

		List<String> words1 = new ArrayList<String>();
		words1.add("Hello");
		words1.add(" world!");
		String s1 = words1.get(0) + words1.get(1);
		System.out.println(s1);

		// Slide 5
		// 1. Stronger type checks at compile time. Example of poor type-checking
		List myList = new ArrayList();
		myList.add("Tom");
		myList.add("Bob");
//		Employee kushal = (Employee) myList.get(0); // try removing (Employee) - error at compile time

		// 2. Reduced downcasting

		// 3. Supports the most general possible API for methods that can be generalized
		List numberList = new ArrayList();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		System.out.println(max0(numberList));
		System.out.println(max1(numberList));

		// slide11 - Creating your own Generic Class or interface
		SimplePair<Integer, String> pair = new SimplePair<>(10123, "Kushal");
		int employeeId = pair.getKey();
		System.out.println(employeeId);

		// Slide 18
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(2);
		ints.add(3);
		System.out.println(ints);
//		List<Number> nums = ints; //gives error

		// Slide22
		T[] arr = null;// ok so far
//		arr = new T[5]; //compilation error : compiler has no information about what type of object to create
		T[] arr1 = (T[]) new Object[5]; // this works
		// Slide 23
//		List<String>[] listA = new ArrayList<String>[5]; //cannot create a generic array of ArrayList<String>
	}

	public static Integer max0(List<Integer> list) {
		Integer max = list.get(0);
		for (Integer i : list) {
			if (i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}

	public static <T extends Comparable<T>> T max1(List<T> list) {
		T max = list.get(0);
		for (T i : list) {
			if (i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}
}
