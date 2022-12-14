package quick_java.lesson8.prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<Double, Double, List<Double>> bFunc = (x, y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x * y);
			return list;
		};

		System.out.println(bFunc.apply(2.0, 3.0));
	}

}
