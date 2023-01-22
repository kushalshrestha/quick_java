/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_interview1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter {
//
public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<Employee>();
    Employee e1 = new Employee("Kushal","Man", "Shrestha",  "2022-03-26");
    Employee e2 = new Employee("Kionel","Messi", "Shrestha",  "2023-01-23");

    Employee e3 = new Employee("Ronaldo","Messi", "Shrestha",  "2022-01-20");
    employeeList.add(e1);
    employeeList.add(e2);
    employeeList.add(e3);
//    System.out.println(e1.getStartDate().minusDays(-30));
//    System.out.println(e1.getStartDate().compareTo(e2.getStartDate()));
//    List<Employee> filteredEmployees = employeeList.stream()
//            .filter(e -> e.getFirstName().startsWith("K"))
//            .collect(Collectors.toList());
//    System.out.println(filteredEmployees);

    System.out.println(e1.getStartDate().compareTo(LocalDate.now()));
    System.out.println(e2.getStartDate().compareTo(LocalDate.now()));
    System.out.println(e1.getStartDate().compareTo(LocalDate.now()));

    List<Employee> filteredEmployees1 = employeeList.stream()
            .filter(e -> e.getStartDate().compareTo(LocalDate.now()) < 0)
            .sorted(Comparator.comparing(Employee::getStartDate))
            .collect(Collectors.toList());
    System.out.println(filteredEmployees1);




}




    public List<Employee> getFilteredEmployees(List<Employee> employeeList) {
        List<Employee> filteredEmployees = employeeList.stream()
                .filter(e -> e.getStartDate().compareTo(LocalDate.now().minusDays(-30)) <= -1)
                .collect(Collectors.toList());
        return filteredEmployees;
    }


}


class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate startDate;

    public Employee(String firstName, String middleName, String lastName, String startDate) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.startDate = LocalDate.parse(startDate);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}


