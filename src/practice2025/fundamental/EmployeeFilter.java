/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package practice2025.fundamental;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        Employee e1 = new Employee("Kushal Shrestha",  "2022-03-26");
        Employee e2 = new Employee("Kionel Shrestha",  "2023-01-23");

        Employee e3 = new Employee("Ronaldo Shrestha",  "2022-01-20");
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        List<Employee> filteredEmployee =
                employeeList.stream().filter(e -> e.getStartDate().compareTo(LocalDate.now()) < 0)
                        .sorted(Comparator.comparing(Employee::getStartDate))
                        .collect(Collectors.toList());
        System.out.println(filteredEmployee);

//        List<Employee> filteredEmployees1 = employeeList.stream()
//                                                        .filter(e -> e.getStartDate().compareTo(LocalDate.now()) < 0)
//                                                        .sorted(Comparator.comparing(Employee::getStartDate))
//                                                        .collect(Collectors.toList());
//        System.out.println(filteredEmployees1);
    }
}

class Employee {
    private String name;
    private LocalDate startDate;

    public Employee(String name, String startDate) {
        this.name = name;
        this.startDate = LocalDate.parse(startDate);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public LocalDate getStartDate(){
        return this.startDate;
    }

    public void setStartDate(LocalDate startDate){
        this.startDate = startDate;
    }

    @Override
    public String toString(){
        return "Employee { name = " + this.name + ", startDate = " + this.startDate + "}";
    }
}
