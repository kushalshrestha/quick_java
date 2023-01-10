/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * LinkedIn : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package design_patterns.factory_design_pattern.practice;

/*
 * You are give a class called 'Person'. The person has two fields: id and name.
 * Please implement a non-static PersonFactory that has a createPerson()  method that takes a person's name and returns a new instance of Person .
 * The id  of the person returned should be set as a 0-based index of the object created by that factory. So, the first person the factory makes should have id=0, second id=1 and so on.
 * */
class Person {
    public int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class PersonFactory {

    private int id = 0;
    public Person createPerson(String name) {
        return new Person(id++, name);
    }
}

class Main {
    public static void main(String[] args) {
        PersonFactory pf = new PersonFactory();
        Person p = pf.createPerson("Kushal");
        System.out.println(p);
    }
}