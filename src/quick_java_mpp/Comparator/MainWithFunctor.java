/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_mpp.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainWithFunctor {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ram", 2000));
        employeeList.add(new Employee("Hari", 1000));
        employeeList.add(new Employee("Shyam", 4000));
        employeeList.add(new Employee("Anil", 5000));


        Collections.sort(employeeList, new EmployeeNameComparator());
        System.out.println(employeeList);

        Collections.sort(employeeList, new EmployeeSalaryComparator());
        System.out.println(employeeList);
    }
}
