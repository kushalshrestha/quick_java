package quick_java_fpp.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge() < o2.getAge()) return -1;
        else if (o1.getAge() > o2.getAge()) return 1;
        else return 0;
    }

}
