package quick_java_mpp.lesson7.prob3;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<String> {

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		System.out.println(t.toUpperCase());
	}

}
