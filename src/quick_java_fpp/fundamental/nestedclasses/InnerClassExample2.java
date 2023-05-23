/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_fpp.fundamental.nestedclasses;


/**
 * SCENARIO : Inner class declared as private, so that outside objects don't access the inner class
 */
class OuterClass2 {
    int x = 10;
    private class InnerClass {
        int y = 5;
    }

    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        InnerClass inner = outerClass2.new InnerClass();
        System.out.println(outerClass2.x + " " + inner.y);
    }
}

