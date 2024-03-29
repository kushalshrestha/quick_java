/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_fpp.fundamental.nestedclasses;

/**
 * SCENARIO : OuterClass and Innerclass declared as default(accessed from same package), so that outside objects can
 * access the inner class
 */
class OuterClass1 {
    int x = 10;
    class InnerClass {
        int y = 5;
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        OuterClass1 myOuter = new OuterClass1();
        OuterClass1.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
