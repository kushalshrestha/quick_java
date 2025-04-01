/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package practice2025.fundamental.recursion;

public class Person {
    private String name;
    private Person behindPerson;

    Person(String name) {
        this.name = name;
        this.behindPerson = null;
    }

    public void setBehindPerson(Person person) {
        this.behindPerson = person;
    }

    int answerToPerson(){
        if(this.behindPerson == null) {
            return 0;
        } else {
            System.out.println("The person behind to " + this.name + " is : " + this.behindPerson.name + ".");
            return behindPerson.answerToPerson() + 1;
        }
    }
}
