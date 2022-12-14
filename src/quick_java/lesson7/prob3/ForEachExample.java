package quick_java.lesson7.prob3;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		// print each element of the list in upper case format
		list.forEach(new MyConsumer());
	}
}