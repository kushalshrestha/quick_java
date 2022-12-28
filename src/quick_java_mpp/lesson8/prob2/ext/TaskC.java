package quick_java_mpp.lesson8.prob2.ext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import quick_java_mpp.lesson8.prob2.Product;

public class TaskC {
	private enum PRODUCTCOMPARATOR {
		BYTITLE, BYPRICE
	}

    public void sort(List<Product> productList, final PRODUCTCOMPARATOR pComparator) {
		class ProductComparator implements Comparator<Product> {

			@Override
			public int compare(Product p1, Product p2) {
				if (pComparator == PRODUCTCOMPARATOR.BYTITLE) {
					return p1.getTitle().compareTo(p2.getTitle());
				} else {
					if (p1.getPrice() == p2.getPrice())
						return 0;
					else if (p1.getPrice() < p2.getPrice())
						return -1;
					else
						return 1;
				}
			}

		}

		Collections.sort(productList, new ProductComparator());
	}

	public static void main(String[] args) {
		TaskC task = new TaskC();
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Philips Television", 298.0, 44));
		productList.add(new Product("Samsung Television", 377.9, 70));
		productList.add(new Product("Roku Smart Television", 199.0, 43));
		productList.add(new Product("LG Television", 259.0, 34));
		productList.add(new Product("Vizio TV", 299.0, 12));

		task.sort(productList, PRODUCTCOMPARATOR.BYPRICE);
		System.out.println(productList);
		task.sort(productList, PRODUCTCOMPARATOR.BYTITLE);
		System.out.println(productList);
	}
}
