

package quick_java_fpp.recursion;

public class PersonLine {
    public static void main(String[] args) {
        Person p1 = new Person("Messi");
        Person p2 = new Person("Ronaldo");
        Person p3 = new Person("Neymar");
        Person p4 = new Person("Mbappe");
        Person p5 = new Person("Haaland");
        p1.setBehindPerson(p2);
        p2.setBehindPerson(p3);
        p3.setBehindPerson(p4);
        p4.setBehindPerson(p5);
        int behindCount = p1.answerToPerson();
        System.out.println("Total person behind : " + behindCount);
    }
}
