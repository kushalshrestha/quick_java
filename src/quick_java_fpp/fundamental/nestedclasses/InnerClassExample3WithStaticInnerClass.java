/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_fpp.fundamental.nestedclasses;

/**
 * Static Inner Class. i.e you can access inner class without creating an object of outer class
 */
class OuterClassExample3 {
    int x = 10;

    static class InnerClass {
        int y = 5;
    }
}

public class InnerClassExample3WithStaticInnerClass {
    public static void main(String[] args) {
        OuterClassExample3.InnerClass myInner = new OuterClassExample3.InnerClass();
        System.out.println(myInner.y);
    }
}
