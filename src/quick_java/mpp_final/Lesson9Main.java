package quick_java.mpp_final;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
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

		// Assignment 9
		// Is there any Vegeterian meal available
		System.out
				.println("Is there any Vegeterian meal available ? Answer: " + Lesson9Main.isVegetarianFriendlyMenu());
		// Is there any healthy menu have calories less than 1000 ( return type boolean)
		System.out.println("Is there any healthy menu have calories less than 1000 ? Answer: "
				+ Lesson9Main.isMenuConsistofLessThan1000Calories());

//		c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
		System.out.println("Is there any unhealthy menu have calories more than 1000 ? Answer: "
				+ Lesson9Main.isMenuConsistofMoreThan1000Calories());

//		d. find and return the first item for the type of MEAT( return type Optional<Dish>)
		System.out.println("First Item for type of Meat ? Answer: " + Lesson9Main.firstItemforTypeMeat());
//		e. calculateTotalCalories() in the menu using reduce. (return int)
		System.out.println("Total calories in menu ? Answer: " + Lesson9Main.calculateTotalCalories());
//		f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
		System.out
				.println("Total calories in menu ? Answer: " + Lesson9Main.calculateTotalCaloriesWithMethodReference());

		// Assignment 10
		Human[] humanList = { new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"),
				new Human("John", 30, "Male") };

		// Query 1 : Print only Female canditates names
		Stream<Human> humanStream = Arrays.stream(humanList);
		Stream<Human> humanStream1 = Stream.of(humanList);
		System.out
				.println(humanStream.filter(human -> human.getGender().equals("Female")).collect(Collectors.toList()));
		// or
		humanStream1.filter(human -> human.getGender().equals("Female")).forEach(System.out::println);

		// Query 2 : Cretae an object by choosing suitable Interface to the specified
		Function<String, Human> function = Human::new;
		// OR
		Function<String, Human> function1 = (s) -> new Human(s);
		Human ob = function.apply("Kushal");
		System.out.println(ob);

		// constructors(Totally 3 constuctors)using fouth type of Method Reference
		// ClassName::new. Then print the object status
		Collection<Human> col1 = arrayToCollection(ArrayList<Human>::new, humanList);
		System.out.println(col1);

		// Query 3 : Count the male candidates whose age is more than 30

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

	private static boolean isVegetarianFriendlyMenu() {
		return Dish.menu.stream().anyMatch(Dish::isVegetarian);
	}

	// Is there any healthy menu have calories less than 1000 ( return type boolean)
	private static boolean isMenuConsistofLessThan1000Calories() {
		return Dish.menu.stream().anyMatch(d -> d.getCalories() < 1000);
	}

//	c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
	private static boolean isMenuConsistofMoreThan1000Calories() {
		return Dish.menu.stream().noneMatch(d -> d.getCalories() >= 1000);
	}

//	d. find and return the first item for the type of MEAT( return type Optional<Dish>)
	private static Optional<Dish> firstItemforTypeMeat() {
		return Dish.menu.stream().filter(item -> item.getType().equals(Dish.Type.MEAT)).findFirst();
	}

//	e. calculateTotalCalories() in the menu using reduce. (return int)
	private static int calculateTotalCalories() {
		return Dish.menu.stream().map(item -> item.getCalories()).reduce(0, (x, y) -> x + y);
//		return Dish.menu.stream().map(Dish::getCalories).reduce(Integer::sum).get();
//		return Dish.menu.stream().map(Dish::getCalories).reduce(Integer::sum).get();
	}

	private static int calculateTotalCalories1() {
		return Dish.menu.stream().collect(Collectors.reducing(0, Dish::getCalories, (Integer i, Integer j) -> i + j));
	}

//	f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
	private static int calculateTotalCaloriesWithMethodReference() {
		return Dish.menu.stream().collect(Collectors.reducing(0, Dish::getCalories, Integer::sum));
	}

	private static int calculateTotalCaloriesWithoutCollectors() {
		return Dish.menu.stream().map(Dish::getCalories).reduce(Integer::sum).get();
	}

	private static int calculateTotalCaloriesUsingSum() {
		return Dish.menu.stream().mapToInt(Dish::getCalories).sum();
	}

	public static Collection<Human> arrayToCollection(Supplier<Collection<Human>> supplier, Human[] humans) {
		Collection<Human> collection = supplier.get();
		for (Human i : humans) {
			collection.add(i);
		}
		return collection;
	}

}
