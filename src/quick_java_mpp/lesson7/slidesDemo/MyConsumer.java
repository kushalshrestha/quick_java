package quick_java_mpp.lesson7.slidesDemo;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<String> {
	@Override
	public void accept(String t) {
		if (t.startsWith("K"))
			System.out.println(t);
	}
}
