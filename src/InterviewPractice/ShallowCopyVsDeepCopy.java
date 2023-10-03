/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewPractice;



import java.util.Arrays;

public class ShallowCopyVsDeepCopy {
    public static void main(String[] args) {
        System.out.println("""
                                   Shallow Copy -> copies the reference of the object
                                   Deep Copy -> copies the object and created a new object
                                   """);
        Person[] personArray = new Person[3];
        personArray[0] = new Person("Kushal", 32);
        personArray[1] = new Person("Anil", 28);
        personArray[2] = new Person("Messi", 37);
        shallowCopyExample(personArray);
        deepCopyExample(personArray);
    }

    private static void deepCopyExample(Person[] personArray) {
        System.out.println("""
                                   Deep Copy example
                                   """);
        Person[] deepCopy = new Person[personArray.length];
        for(int i = 0; i < personArray.length; i++) {
            deepCopy[i] = new Person(personArray[i].getName(), personArray[i].getAge());
        }
        System.out.println(Arrays.toString(personArray));
        deepCopy[0].setName("Kushal Man Shrestha");
        System.out.println(Arrays.toString(deepCopy));
    }

    private static void shallowCopyExample(Person[] personArray) {
        Person[] shallowCopy = Arrays.copyOf(personArray, personArray.length);
        shallowCopy[0].setName("Kushal Shrestha");

        System.out.println(Arrays.toString(personArray));
        System.out.println(Arrays.toString(shallowCopy));
    }


}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString(){
        return "Person { name = '"+ name+"', age = " + age + " }";
    }
}
