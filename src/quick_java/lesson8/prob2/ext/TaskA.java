package quick_java.lesson8.prob2.ext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import quick_java.lesson8.prob2.Product;
import quick_java.lesson8.prob2.ProductPriceComparator;

public class TaskA {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Philips Television", 298.0, 44));
		productList.add(new Product("Samsung Television", 377.9, 70));
		productList.add(new Product("Roku Smart Television", 199.0, 43));
		productList.add(new Product("LG Television", 259.0, 34));
		productList.add(new Product("Vizio TV", 299.0, 12));
		Collections.sort(productList, new ProductPriceComparator());
		System.out.println(productList);
	}
}
