/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package practice2025.exceptions;

public class Finally {
    public static void main(String[] args) {
        try {
            test();
            test1();
            test2();
            test3();
            test4();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

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
            System.out.println("After System.exit(), finally block executes");
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
        System.out.println("Last statement 333333");
    }

    public static void test4() throws Exception {
        try {
            throw new Exception("Exception in try block while trying to ...");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Exception in catch block throwing ...");
        } finally {
            System.out.println("Finally 444444 !!!");
        }
//        System.out.println("Last statement"); // unreachable statement
    }
}
