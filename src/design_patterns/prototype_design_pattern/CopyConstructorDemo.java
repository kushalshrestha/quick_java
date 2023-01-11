/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * LinkedIn : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package design_patterns.prototype_design_pattern;

/**
 * Approach : consturct copy constructor like:
 * public Address(Address other) { ...} for cloning using deep copy approach
 * */
class Address {
    public String streetAddress, city, country;

    public Address(String streetAddress, String city, String country) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.country = country;
    }

    public Address(Address other) {
        this(other.streetAddress, other.city, other.country);
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

class Employee {
    public String name;
    public Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Employee(Employee other) {
        name = other.name;
        address = new Address(other.address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

class CopyConstructorDemo {
    public static void main(String[] args) {
        Employee kushal = new Employee("Kushal",
                new Address("Satdobato", "Lalitpur", "Nepal"));

        //Employee chris = john;
        Employee messi = new Employee(kushal);

        messi.name = "Messi";
        System.out.println(kushal);
        System.out.println(messi);
    }
}
