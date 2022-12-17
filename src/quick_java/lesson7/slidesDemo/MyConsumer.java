package quick_java.lesson7.slidesDemo;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<String> {
	@Override
	public void accept(String t) {
		if (t.startsWith("K"))
			System.out.println(t);
	}
}
