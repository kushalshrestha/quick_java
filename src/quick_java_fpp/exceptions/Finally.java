/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package quick_java_fpp.exceptions;

public class Finally {
    public static void test() throws Exception {
        try {
            System.out.println("Try block");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Block !!!");
        }
        System.out.println("Last statement");
    }

    public static void test1() throws Exception {
        try {
            return;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Even after break or return, finally block executes");
            System.out.println("Finally !!!");
        }
        System.out.println("Last statement");
    }

    public static void test2() throws Exception {
        try {
            System.exit(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Even after break or return, finally block executes");
            System.out.println("Finally !!!");
        }
        System.out.println("Last statement");
    }

    public static void test3() throws Exception {
        try {
            throw new Exception("Exception in try block while trying to ...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally !!!");
        }
        System.out.println("Last statement");
    }

    public static void test4() throws Exception {
        try {
            throw new Exception("Exception in try block while trying to ...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Exception in catch block throwing ...");
        } finally {
            System.out.println("Finally !!!");
        }
//        System.out.println("Last statement"); // unreachable statement
    }

    public static void main(String[] args) {
        try {
            test();
            System.out.println("End of test()");
            test1();
            System.out.println("End of test1()");
            test2();
            System.out.println("End of test2(). test3() and test4() won't execute since, System.exit() applied");
            test3();
            System.out.println("End of test3()");
            test4();
            System.out.println("End of test4()");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
