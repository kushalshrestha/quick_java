package quick_java.lesson7.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		// print each element of the list in upper case format
		list.forEach(new MyConsumer());
		
		Consumer<String> consumer1 = new Consumer<String>() {

			@Override
			public void accept(String s) {
				// TODO Auto-generated method stub
				System.out.println(s.toUpperCase());
				
			}
			
		};
		
		
		list.forEach(consumer1);
		
	}
}