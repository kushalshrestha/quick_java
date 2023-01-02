
package quick_java_fpp.nested_classes;

import quick_java_mpp.lesson8.prob3.MyClass;

public class StaticNestedClass {
    public int i = 4;

    public int getInt() {
        return 3;
    }

    StaticNestedClass() {
        NestedClass nc = new NestedClass();
        nc.innerMethod();

        System.out.println(nc.x);
    }

    public static void main(String[] args) {
        new StaticNestedClass();
    }

    static class NestedClass {
        private int x = 100;

        public void innerMethod() {
//            Nested class do not have access to instance variables and methods of the enclosing class
//            int j = i; // compiler error, won't have compiler error if static was removed
//            System.out.println(getInt()); // compiler error, won't have compiler error if static was removed'
            System.out.println("Nested class | Inner method called !!!");
        }
    }
}

class AnotherClass {
    public static void main(String[] args) {
        StaticNestedClass.NestedClass nc = new StaticNestedClass.NestedClass();
        StaticNestedClass snc = new StaticNestedClass();
//        StaticNestedClass.NestedClass nd2 = snc.new NestedClass(); // illegal, compiler error since static class

    }
}
