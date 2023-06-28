/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package design_patterns.singleton_design_pattern;

public class LazySingleton {
    private static LazySingleton instance;
    private int value = 0;

    public LazySingleton() {
        System.out.println("initializing LazySingleton");
    }

    // Lazy approach - first check if already instance is created
    // Problem : not thread safe, when multiple threads can lead to multiple instances. So add 'synchronized'
//    public static synchronized LazySingleton getInstance() {
//        if (instance == null) {
//            instance = new LazySingleton();
//        }
//        return instance;
//    }

    // another approach - double-checked locking
    // check twice to make sure that instance is created only once
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}

class LazySingletonDemo {
    public static void main(String[] args) {
        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(2143123);
        System.out.println("BasicSingleton value is :s " + singleton.getValue() + "");
    }
}
