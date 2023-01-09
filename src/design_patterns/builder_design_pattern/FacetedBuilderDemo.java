/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * LinkedIn : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package design_patterns.builder_design_pattern;

public class FacetedBuilderDemo {
    public static void main(String[] args) {
        PersonBuilderClass pb = new PersonBuilderClass();
        PersonClass person = pb.lives().at("1000N 4th Street").in("Fairfield").withPostcode("52557")
                .works().at("Cotiviti").asA("Engineer").earning(120000).build();
        System.out.println(person);

    }
}

class PersonClass {
    //address
    public String streetAddress, postcode, city;

    //employment
    public String companyName, position;
    public int annualIncome;

    @Override
    public String toString() {
        return "PersonClass{" +
                "streetAddress='" + streetAddress + '\'' +
                ", postCode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                ", companyName='" + companyName + '\'' +
                ", position='" + position + '\'' +
                ", annualIncome=" + annualIncome +
                '}';
    }
}

// builder facade
class PersonBuilderClass {
    // Step1 : object we're going to build
    protected PersonClass person = new PersonClass();

    // Step2 : create sub builders : jobbuilder and addressbuilder
    public PersonJobBuilder works() {
        return new PersonJobBuilder(person);
    }

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    //Step3 : final build
    public PersonClass build() {
        return person;
    }
}

//sub builders
class PersonJobBuilder extends PersonBuilderClass {
    // Step1 : constructor
    public PersonJobBuilder(PersonClass person) {
        this.person = person;
    }

    public PersonJobBuilder at(String companyName) {
        person.companyName = companyName;
        return this;
    }

    public PersonJobBuilder asA(String position) {
        person.position = position;
        return this;
    }

    public PersonJobBuilder earning(int annualIncome) {
        person.annualIncome = annualIncome;
        return this;
    }
}

class PersonAddressBuilder extends PersonBuilderClass {
    public PersonAddressBuilder(PersonClass person) {
        this.person = person;
    }

    public PersonAddressBuilder at(String streetAddress) {
        person.streetAddress = streetAddress;
        return this;
    }

    public PersonAddressBuilder withPostcode(String postcode) {
        person.postcode = postcode;
        return this;
    }

    public PersonAddressBuilder in(String city) {
        person.city = city;
        return this;
    }
}