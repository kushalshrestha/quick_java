package quick_java.lesson8.prob5;

import java.util.Arrays;

public class NameSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
		
		
		System.out.println("Printing the list using method reference");
		System.out.println("===========================================");
		
//		Arrays.sort(names, (s1, s2)-> s1.compareToIgnoreCase(s2));
		Arrays.sort(names, String::compareToIgnoreCase);
		
		System.out.println(Arrays.toString(names));
		

	}

}
