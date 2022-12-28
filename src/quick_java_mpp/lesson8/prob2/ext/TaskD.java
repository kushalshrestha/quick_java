package quick_java_mpp.lesson8.prob2.ext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import quick_java_mpp.lesson8.prob2.Product;

public class TaskD {
	public void sort(List<Product> productList) {
		Collections.sort(productList, (p1, p2) -> {
			if (p1.getTitle().compareTo(p2.getTitle()) == 0) {
				if (p1.getModel() == p2.getModel())
					return 0;
				else if (p1.getModel() < p2.getModel())
					return -1;
				else
					return 1;
			} else {
				return p1.getTitle().compareTo(p2.getTitle());
			}
		});

	}

	public static void main(String[] args) {
		TaskD task = new TaskD();
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("LG Television", 298.0, 44));
		productList.add(new Product("Samsung Television", 377.9, 70));
		productList.add(new Product("Roku Smart Television", 199.0, 43));
		productList.add(new Product("LG Television", 259.0, 34));
		productList.add(new Product("Samsung Television", 299.0, 12));
		task.sort(productList);
		System.out.println(productList);
	}
}
