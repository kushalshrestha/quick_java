package quick_java.mpp_final;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Lesson10Main {

	// Fix this code
//	public static Group<?> copy(Group<?> group) {
//		List<?> elements = group.getElements();
//		Group<?> grp = new Group<?>(group.getSpecialElement(), elements);
//		return grp;
//	}

	// Fix this code
	public static Group<?> copy(Group<?> group) {
		return copyHelper(group);

	}

	public static <T> Group<T> copyHelper(Group<T> group) {
		List<T> elements = group.getElements();
		Group<T> grp = new Group<T>(group.getSpecialElement(), elements);
		return grp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4);
		Group<Integer> group = new Group<>(0, list);
		System.out.println(group);
		System.out.println(Lesson10Main.copy(group));

		Predicate<? super Number> is5 = a -> a.equals(5);
		int ab = 15;
		System.out.println(is5.test(ab));

		CustomKPredicate<? super Number, Boolean> f = a -> a.equals(5);
		System.out.println(f.test(5.2));

		List<? extends Number> numList = Arrays.asList(2, 4.5);
		System.out.println(numList.get(0));
		System.out.println(numList.get(1));
//		numList.add(4);
		System.out.println(numList.size());
		
		System.out.println("afds");
		Random a = new Random();
		System.out.println(a.nextInt());
	}

}
