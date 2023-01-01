package quick_java_fpp.objects_classes;

import static quick_java_fpp.objects_classes.Label.RIGHT;

public class Main {
    private static int count;

    Main() {
        ++count;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Object");

        Label l = new Label("Hi Kushal!", Label.RIGHT);
        int i = l.getAlignment();
        System.out.println(l.getText());
        System.out.println(l.getAlignment());

        Label l2 = l; // Assigning to an already existing object variable
        System.out.println(l2.getText());
        l2.setText("Updated message: Hello Kush!");
        System.out.println(l.getText());
        System.out.println(l2.getText());
        System.out.println("NOTE: Both object instances have been updated, because the reference is same. i.e l1 (object variable) holds the reference not the value");

        for (int j = 0; j < 10; ++j) {
            Main m = new Main();
            System.out.println(m.getCount());
        }

        System.out.println("Num instances created : " + Main.count);

        System.out.println("How Objects and Variables are stored in Memory");
        System.out.println("Registers - fastest area of memory");
        System.out.println("The Stack - second fastest area of RAM because of direct support from processor for the stack pointer | stores local variables and method names; as variables are initialized inside a method, they are also added to the stack. When method exits, all of these are popped. Object references are also stored on the stack, but the objects themselves are not.");
        System.out.println("The Heap - general purpose pool of memory (in RAM still) where JAVA objects are placed. Flexible than Stack but bit slower.");
        System.out.println("Static Storage - another area of RAM that holds object references that have been declared 'static' in the Java program.");
        Main m1 = new Main();
        int number = 50;
        m1.callByValueForRaise(number);
        System.out.println("Call By Value for primitive type (here int) -> Value of number : " + number);

        Subclass sub = new Subclass();
        sub.supermethod();

        System.out.println("================================================================");
        System.out.println("Inheritance");
        System.out.println("================================================================");

        Manager managerObj = new Manager("Jose Mourinho", 80000, 1989, 10, 1);
        managerObj.setBonus(20000);

        Employee[] employees = new Employee[3];
        employees[0] = managerObj;
        employees[1] = new Employee("Pablo Dyabala", 12000, 2000, 6, 26);
        employees[2] = new Employee("Chris Smalling", 5000, 1996, 8, 21);

        for (Employee e : employees) {
            System.out.println("name : " + e.getName() + "\n salary : " + e.getSalary());
        }

        Manager m = new Manager("Mikel Arteta", 60000, 1994, 10, 12);
        System.out.println("Manager's name : " + m.getName());
        System.out.println("Manager's salary without bonus: " + m.getSalary());
        m.setBonus(10000);
        System.out.println("Manager's salary with bonus : " + m.getSalary());
        System.out.println("When toString() is used without overriden, the output is : " + m.toString());

    }

    public void callByValueForRaise(int x) {
        x = 3 * x;
        System.out.println(x);
    }

}
