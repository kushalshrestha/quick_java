package quick_java.lesson7.slidesDemo;

import java.util.ArrayList;
import java.util.List;

public class SlidesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimalPerson mp = new MinimalPerson("Kushal", "Shrestha", "101 Adams", "Fairfield", "IA");
		PersonInDetail pd = new PersonInDetail("Kushal", "Man", "Shrestha",
				new Address("101 Adams", "Fairfield", "IA"));
		
		List<NameAddress> directory = new ArrayList<>();
		directory.add(mp);
		directory.add(pd);
		
		for(NameAddress na:directory)
			System.out.println(na.formattedOutput());
		
		

	}

}
