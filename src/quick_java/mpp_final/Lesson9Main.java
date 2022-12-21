package quick_java.mpp_final;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson9Main {

	public static void main(String[] args) {

		// Assignment 1
		Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
		System.out.println(stringStream.collect(Collectors.toList()));
		System.out.println(Arrays.asList("Bill", "Thomas", "Mary").stream().collect(Collectors.toList()));

		// Assignment2
		Stream<Integer> intStream = Arrays.asList(1, 2, 3).stream();
		IntSummaryStatistics summary = intStream.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(summary);
		System.out.println("max = " + summary.getMax() + " min = " + summary.getMin());

		// Assignment 3
		Lesson9Main l9m = new Lesson9Main();
		List<String> words = Arrays.asList("Bob", "BOB", "Alice", "Tim", "Joe", "Anthony", "Caleb", "Tom", "Bee", "Bot",
				"Tea", "ATT");
		System.out.println(l9m.countWords(words, 'o', 'y', 3));

	}

	public int countWords(List<String> words, char c, char d, int len) {
		return words.stream().map(x -> x.toLowerCase())
				.filter(x -> x.length() == len && x.contains("" + c) && !x.contains("" + d))
				.collect(Collectors.toList()).size();
	}

}
