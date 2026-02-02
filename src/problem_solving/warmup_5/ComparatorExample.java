/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/*
💡 Memory Tip:
Comparable → inside class, natural order
Comparator → external, custom order

Comparator is a functional interface in java that contains the compare method.
And by overloading the compare method,
we can define that on what basis we need to compare the values.
 */

public class ComparatorExample {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Charlie", 4000));
        employees.add(new Employee("Alice", 18000));
        employees.add(new Employee("Alex", 5000));
        employees.add(new Employee("Bob", 3000));

        // Sort by salary (ascending)
        employees.sort(Comparator.comparingInt(Employee::getSalary));
        System.out.println(employees);

        // Sort by name (ascending)
        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println(employees);

        // Sort by name (descending)
        employees.sort(Comparator.comparing(Employee::getName).reversed());
        System.out.println(employees);

        // Multiple criteria (By Name and then By Salary)
        employees.sort(
                Comparator.comparing(Employee::getName)
                        .thenComparing(Employee::getSalary)
        );
        System.out.println(employees);
    }


}

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }

    @Override
    public String toString(){
        return "Employee : {name = " + name + ", salary = " + salary + "}";
    }
}
