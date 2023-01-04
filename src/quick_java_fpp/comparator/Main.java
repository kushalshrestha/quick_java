package quick_java_fpp.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person[] personsList = {new Person("Kane", 31),
                new Person("Andriy", 27)};
        Arrays.sort(personsList, new NameComparator());
        System.out.println("1. Sorting in ascending order... (using NameComparator)");
        System.out.println(Arrays.toString(personsList));

        System.out.println("2. Alternative way - lambda expression : Sorting in ascending order... (using NameComparator)");
        Comparator<Person> comp = (p1, p2) -> {
            return p1.getName().compareTo(p2.getName());
        };
        Arrays.sort(personsList, comp);
        System.out.println(Arrays.toString(personsList));


        System.out.println("3. Alternative way - Anonymous inner class : Sorting in ascending order... (using NameComparator)");
        Arrays.sort(personsList, new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p1.getName());
            }
        });

        System.out.println(Arrays.toString(personsList));

        System.out.println("4. Alternative way - Anonymous inner class as lambda : Sorting in ascending order... (using NameComparator)");
        Arrays.sort(personsList, (p1, p2) -> p1.getName().compareTo(p1.getName()));

        System.out.println(Arrays.toString(personsList));



        System.out.println("================================================================");
        Person[] personsList1 = {
                new Person("Kane", 31),
                new Person("Andriy", 27),
                new Person("Kaka", 22),
                new Person("Pirlo", 31),
                new Person("Gattuso", 30)
        };
        System.out.println("SORTING BY NAME");
        Arrays.sort(personsList1, new NameComparator());
        System.out.println(Arrays.toString(personsList1));
        System.out.println("SORTING BY AGE");
        Arrays.sort(personsList1, new AgeComparator());
        System.out.println(Arrays.toString(personsList1));





    }
}
