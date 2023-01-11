package design_patterns.singleton_design_pattern;

import java.util.stream.BaseStream;

public class BasicSingleton {
    private int value = 0;


    //we create private constructor so that nobody can instantiate from outside.
    private BasicSingleton() {

    }

    // so to expose the one and only instance we return the instance
    public static BasicSingleton getInstance() {
        return INSTANCE;
    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}

class Demo {
    public static void main(String[] args) {
        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(12432);
        System.out.println("BasicSingleton value is :s " + singleton.getValue() + "");
    }
}
