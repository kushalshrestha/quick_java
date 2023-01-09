/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * LinkedIn : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package design_patterns.builder_design_pattern;

// builder inheritance with recursive generics

public class BuilderDemoWithRecursiveGenerics {
    public static void main(String[] args) {
        EmployeeBuilder eb = new EmployeeBuilder().withName("Kushal").worksAs("Java Developer");
        System.out.println(eb.build());
    }
}

class Person {
    public String name;

    public String position;

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", position='" + position + '\'' + '}';
    }
}


/**
 * Generics added
 * SELF -> to resonate the return of the same class data type
 * else, withName() and worksAt() are methods on two different classes
 * */
class PersonBuilder<SELF extends PersonBuilder<SELF>> {
    protected Person person = new Person();

    // critical to return SELF here
    public SELF withName(String name) {
        person.name = name;
        return self();
    }

    /**
     * self() method added so that this can be overwrite on subclasses
     * */
    protected SELF self() {
        // unchecked cast, but actually safe
        // proof: try sticking a non-PersonBuilder
        //        as SELF parameter; it won't work!
        return (SELF) this;
    }

    public Person build() {
        return person;
    }
}

class EmployeeBuilder extends PersonBuilder<EmployeeBuilder> {
    public EmployeeBuilder worksAs(String position) {
        person.position = position;
        return self();
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
