package quick_java.mpp_final;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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

		// Assignment 3 using own interface
		// definition
		KTriFunction<String, String, Integer, Predicate<String>> func = (x, y,
				z) -> (word -> word.contains("" + x) && !word.contains("" + y) && word.length() == z);
		Predicate<String> filter1 = func.apply("o", "y", 3);
		System.out.println(words.stream().filter(filter1).count());

		// Assignment 3 : advanced approach
		KQuadFunction<List<String>, String, String, Integer, Long> directFunc = (list, w1, w2, len) -> list.stream()
				.filter(word -> word.contains("" + w1) && !word.contains("" + w2) && word.length() == len).count();
		System.out.println(directFunc.apply(words, "o", "y", 3));

		// Assignment 4
		System.out.println("=====");
		printSquares(5);
		System.out.println("=====");

		// Assignment 5
		List<String> wordTest5 = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");
		Stream<String> output5 = l9m.streamSection(wordTest5.stream(), 1, 3);
		System.out.println(output5.collect(Collectors.toList()));

		// Assignment 8
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		// Query 1: Find all transactions from year 2011 and sort them by value (small
		// to high).
		List<Transaction> transaction2011 = transactions.stream().filter(x -> x.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
		System.out.println(transaction2011);

		// Query 2: What are all the unique cities where the traders work?
		List<String> city = transactions.stream().map(x -> x.getTrader().getCity()).distinct()
				.collect(Collectors.toList());
		System.out.println(city);

		// Query 3: Find all traders from Cambridge and sort them by name.
		List<Trader> traders = transactions.stream().filter(x -> x.getTrader().getCity() == "Cambridge")
				.map(x -> x.getTrader()).sorted(Comparator.comparing(Trader::getName)).distinct()
				.collect(Collectors.toList());
		System.out.println(traders);
		List<Trader> cambridgeTraders = transactions.stream().map(Transaction::getTrader)
				.filter(trader -> trader.getCity().equals("Cambridge")).distinct()
				.sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
		System.out.println(cambridgeTraders);

		// // Query 4: Return a string of all traders names sorted alphabetically.
		List<Trader> traderSortedList = transactions.stream().map(transaction -> transaction.getTrader())
				.sorted(Comparator.comparing(Trader::getName)).distinct().collect(Collectors.toList());
		System.out.println(traderSortedList);

		String traderStr1 = transactions.stream().map(transaction -> transaction.getTrader().getName()).distinct()
				.sorted().reduce(" ", (n1, n2) -> n1 + " " + n2).trim();
		System.out.println(traderStr1);

		// Query 5: Are there any trader based in Milan?
		boolean milanTraders = transactions.stream()
				.anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
		System.out.println(milanTraders);

		// Query 6: Update all transactions so that the traders from Milan are set to
		// Cambridge.
		System.out.println("=====Query 6 ======");

		transactions.stream().map(Transaction::getTrader).filter(trader -> trader.getCity().equals("Milan"))
				.forEach(trader -> trader.setCity("Cambridge"));

		System.out.println(transactions);

		// Query 7: What's the highest value in all the transactions?
		int highestValue = transactions.stream().map(transaction -> transaction.getValue()).reduce(0, Integer::max);

		System.out.println(highestValue);

	}

	public int countWords(List<String> words, char c, char d, int len) {
		return words.stream().map(x -> x.toLowerCase())
				.filter(x -> x.length() == len && x.contains("" + c) && !x.contains("" + d))
				.collect(Collectors.toList()).size();
	}

	public static void printSquares(int limit) {
		IntStream squares = IntStream.iterate(1, n -> n + 1).map(n -> n * n).limit(limit);
		squares.forEach(System.out::println);

	}

	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		return stream.limit(n + 1).skip(m);
//		return stream.skip(m).limit(n);  // both works but n & n+1 (notice the difference)
	}

}
