package quick_java.lesson9.slidesDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SlidesDemo1 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>(Arrays.asList("Java", "C++", "Android", "Angular", "Html", "Kotlin"));

		// Code1 - Filter the names length>5 - Slide - 12
		// Can obtain the Stream from the collection

		List<String> r1 = names.stream() // Step 1: Create a Stream
				.filter(s -> s.length() > 5) // 2. Intermediate operations - One or more
				.collect(Collectors.toList()); // 3. One terminal operations
		System.out.println(r1);

		// Slide - 14 - Several ways to create stream
		// Way -1 - From Array to Stream
		Integer[] arrOfInt = { 1, 3, 5, 7 };
		Stream<Integer> int1 = Stream.of(arrOfInt);
		System.out.println("Count = " + int1.count());

		int[] arrOfInt1 = { 1, 3, 5, 7 }; // Array is an object
		int[] arrOfInt2 = { 1, 3, 8, 0 };
		// Collections of Arrays to Stream
		// Stream<Integer>[];illegal
		Stream<int[]> int2 = Stream.of(arrOfInt1); // Single collection
		Stream<int[]> int3 = Stream.of(arrOfInt1, arrOfInt2);
		// System.out.println("Array Count = " + int3.count() );
		int3.forEach(x -> System.out.println(Arrays.toString(x))); // Terminal

		// Instead of going with Stream<Integer>, better to use IntStream - Efficient
		IntStream coll = IntStream.of(10, 11, 34, 55);
		long l = coll.filter(x -> (x % 2 != 0)).count(); // Terminal
		System.out.println("Odd Count = " + l);

		// Make a collection of Stream of Strings
		Stream<String> song = Stream.of("gently", "down", "the", "stream");
		song.forEach(System.out::println); // Terminal

		// Slide - 15 -Infinite Streams --> generate and iterate
		// Want to print Java infinite times
		Stream.generate(() -> "Java").limit(5) // Apply intermediate limit to make finite
				.forEach(System.out::println);

		Stream<Double> randoms = Stream.generate(Math::random);
		randoms.limit(5).forEach(System.out::println);
		// I want to print 5 odd numbers using Iterate
		Stream.iterate(1, n -> n + 2).limit(5) // Intermediate
				.skip(3) // Intermediate
				.forEach(System.out::println);

		// Slide - 23 - map - Intermedaiate operation
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 6, 5);
		// Print the even squared vales
		List<Integer> col1 = numbers.stream().filter(x -> x % 2 == 0) // Intermediate
				.map(x -> x * x)// Intermediate
				.collect(Collectors.toList());
		System.out.println(col1);

		// Creation of Strings using Classname::new
		// Slide 25
		char[] charArray = { 's', 'p', 'e', 'a', 'k', 'i', 'n', 'g', 'c', 's' };
		// Imperative Style - Convert char[] to String
		String s = new String(charArray);
		System.out.println(s);
		// Lambdas
		Function<char[], String> fun1 = (a) -> new String(a);
		System.out.println(fun1.apply(charArray));
		// Class::new
		Function<char[], String> fun2 = String::new;
		System.out.println(fun2.apply(charArray));

		// Imperative Item object
		Item ob1 = new Item("HP Laptop", 699.99);
		System.out.println(ob1);
		// Lambda Item Object
		BiFunction<String, Double, Item> ob2 = (n, p) -> new Item(n, p);
		System.out.println(ob2.apply("HP Laptop", 699.99));
		// Method Reference
		BiFunction<String, Double, Item> ob3 = Item::new;
		System.out.println(ob3.apply("HP Laptop", 699.99));
		// Slide - 32 - Flat Map
		List<Integer> list3 = Stream.of(1, 2, 3, 4).flatMap(n -> Stream.of(n, n * n)) // Stream<Stream<Integer>> -- Map,
																						// Flatmap Stream<Integer>
				.collect(Collectors.toList());
		System.out.println(list3);
		// Slide - 34 - Stateful operations distinct(), sorted()

		Stream<String> uniqueWords = Stream.of("merrily", "merrily", "merrily", "gently").distinct(); // Intermedaite
																										// stateful
		uniqueWords.forEach(System.out::println);
		names.stream().sorted().forEach(System.out::println);

		// Slide 36
		List<String> words = Arrays.asList("Tom", "Joseph", "Richard");
		Stream<String> longestFirst1 = words.stream().sorted();
		System.out.println(longestFirst1.collect(Collectors.toList()));

		Stream<String> longestFirst2 = words.stream().sorted((x, y) -> y.length() - x.length());
		System.out.println(longestFirst2.collect(Collectors.toList()));

		Stream<String> longestFirst3 = words.stream().sorted(Comparator.comparing(String::length).reversed());
		System.out.println(longestFirst3.collect(Collectors.toList()));

		// slide 47
		List<String> words1 = Arrays.asList("Tom", "Joseph", "Richard");
		Optional<String> res = words1.stream().filter(x -> x.length() > 10).max(String::compareToIgnoreCase);
		// several options available to check optional result without null exception
		// 1. isPresent
		if (res.isPresent())
			System.out.println(res.get());
		else
			System.out.println("No max");

		// 2. ifPresent
		res.ifPresent(x -> System.out.println(x)); // if data available, only then will print

		// Alternative way : orElse
		System.out.println(res.orElse("No Max"));
		System.out.println(res.orElse("====="));

		// findFirst
		// Uncomment and fix the 'list' i.e create list
//		Optional<String> name = words1.stream().map(x->x.getName()).filter(x->x.startsWith("A")).findFirst();
		Optional<String> name = words1.stream().filter(x -> x.startsWith("A")).findFirst();
		System.out.println(name);
		System.out.println(name.orElse("No item starting from R"));

		// orElseGet and Creating your own optional
		Optional<Double> inv = inverse(5.0);
		System.out.println("Inverse of x = " + inv.orElse(0.0));

		Optional<String> fullName = Optional.of("Kushal Shrestha");
		System.out.println("full name = " + fullName.orElseGet(() -> "Dipesh KC"));
		Optional<String> anotherFullName = Optional.ofNullable(null);
		System.out.println("full name = " + anotherFullName.orElseGet(() -> "Dipesh KC"));

		// slide 66
		List<Integer> numbers1 = Arrays.asList(9, 10, 3, 4, 7, 8);
		Integer sum1 = numbers1.stream().reduce(0, (x1, y1) -> x1 + y1);
		System.out.println(sum1);

		Optional<Integer> sum = numbers1.stream().reduce((x, y) -> x + y);
		System.out.println(sum);

		// find the sum of Item's price using reduce method
		// fix - > list refers to List<Item>
//		Double tPrice = list.stream().map(x->x.getPrice()).reduce(0.0, Double::sum);

		Stream<String> strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
		System.out.println(strings.reduce("", (x, y) -> x + " " + y).trim());
		
		
		// Stream reuse - solution 1
		getStream(names).filter(x->x.startsWith("J")).sorted().map(x->x.toUpperCase()).forEach(System.out::println);
		getStream(names).filter(x->x.startsWith("J")).sorted().map(String::toUpperCase).forEach(System.out::println);
		
		//Stream reuse - solution 2
		// Create function

	}

	public static Optional<Double> inverse(Double x) {
		return x == null || x == 0.0 ? Optional.empty() : Optional.of(1 / x);
	}

	public static Stream<Character> characterStream(String s) {
		List<Character> result = new ArrayList<>();
		for (char c : s.toCharArray())
			result.add(c);
		return result.stream();
	}
	
	
	//Solution 1: creating method for calling multiple times stream
	public static Stream<String> getStream(List<String> list) {
		return list.stream();
	}

}
