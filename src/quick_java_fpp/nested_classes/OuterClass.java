/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package quick_java_fpp.nested_classes;

/**
 * Member Inner Class Examples
 */
public class OuterClass {

    private int x = 10;
    private String outerThis = "Outer this!!!";

    OuterClass() {
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
            System.out.println(OuterClass.this.outerThis);
        }
    }

    public static void main(String[] args) {
        new OuterClass();
    }
}
