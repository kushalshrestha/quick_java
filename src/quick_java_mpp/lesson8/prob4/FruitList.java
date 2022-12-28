package quick_java_mpp.lesson8.prob4;

import java.util.Arrays;
import java.util.List;

public class FruitList {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
		
		System.out.println("Printing the list using forEach with lambdas");
		System.out.println("===========================================");
		fruits.forEach(fruit->System.out.println(fruit));
		System.out.println("===========================================");
		
		System.out.println("===========================================");
		System.out.println("Printing the list using method reference");
		System.out.println("===========================================");
		fruits.forEach(System.out::println);
	}

}
