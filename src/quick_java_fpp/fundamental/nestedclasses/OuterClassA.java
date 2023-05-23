/*
 * Copyright (c) 2023. 
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_fpp.fundamental.nestedclasses;

/**
 * Member Inner Class Examples
 */
public class OuterClassA {

    private int x = 10;
    private String outerThis = "Outer this!!!";

    OuterClassA() {
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.innerVariable);
        innerClass.innerClassMethod();
        System.out.println(innerClass.innerThis);
        System.out.println(this.outerThis);
    }

    public class InnerClass {
        private int innerVariable = 3;
        private String innerThis = "Inner this!!!";

        public void innerClassMethod() {
            System.out.println("This is inner class method");
            System.out.println("Value of x is : " + x);
            System.out.println(OuterClassA.this.outerThis);
        }
    }

    public static void main(String[] args) {
        new OuterClassA();
    }
}
