package quick_java.lesson7.slidesDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyTestClass {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Java Spring");
		list.add("Android");
		list.add("Kotlin");
		list.add("Java Hibernate");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("========");
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("========");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("========");
		list.forEach(s -> System.out.println(s));
		
		System.out.println("========");
		list.forEach(new MyConsumer());
	}
}
