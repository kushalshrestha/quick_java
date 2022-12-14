package quick_java_mpp.lesson9.inclass_exercise.exercise3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	// Use Comparator.comparing and thenComparing to sort
	// the list by balance and then by ownerName
	// Collect your stream into a list and print the sorted
	// result to the console
	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<Account>() {
			{
				add(new Account("Bob", 5000, 1001));
				add(new Account("Jim", 10000, 1002));
				add(new Account("Bruce", 5300, 1003));
				add(new Account("Li", 12000, 1004));
				add(new Account("Sam", 9000, 1005));
				add(new Account("Rick", 11000, 1006));
			}
		};

		// sorting code here
		accounts.stream().sorted(Comparator.comparing(Account::getBalance).thenComparing(Account::getOwnerName))
				.forEach(System.out::println);
		System.out.println("======Alternative way======");
		List<Account> output = accounts.stream()
				.sorted(Comparator.comparing(Account::getBalance).thenComparing(Account::getOwnerName))
				.collect(Collectors.toList());
		System.out.println(output);
	}

}