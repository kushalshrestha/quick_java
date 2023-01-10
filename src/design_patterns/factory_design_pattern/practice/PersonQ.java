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
class PersonQ {
    public int id;
    public String name;

    public PersonQ(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class PersonFactoryQ {
    public PersonQ createPerson(String name) {
        // todo
        return null;
    }
}