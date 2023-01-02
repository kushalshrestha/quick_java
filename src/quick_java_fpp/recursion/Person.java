

package quick_java_fpp.recursion;

public class Person {
    private String name;
    private Person behindPerson;

    Person(String name) {
        this.name = name;
        this.behindPerson = null;
    }

    int answerToPerson() {
        if (this.behindPerson == null) {
            return 0;
        } else {
            System.out.println("The person behind to " + this.name + " is " + this.behindPerson.name + ".");
            return behindPerson.answerToPerson() + 1;
        }
    }

    public void setBehindPerson(Person behindPerson) {
        this.behindPerson = behindPerson;
    }
}
