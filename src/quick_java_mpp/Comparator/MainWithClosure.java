/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_mpp.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainWithClosure {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ram", 2000));
        employeeList.add(new Employee("Hari", 1000));
        employeeList.add(new Employee("Shyam", 4000));
        employeeList.add(new Employee("Anil", 5000));

        // Sort by name using closure -> Here new Comparator<Employee> serves as a closure
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(
                    Employee e1,
                    Employee e2
            ) {
                return e1.getName()
                         .compareTo(e2.getName());
            }
        });
        System.out.println("Sorted by name: " + employeeList);

        // Sort by salary using closure -> Here new Comparator<Employee> serves as a closure
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(
                    Employee e1,
                    Employee e2
            ) {
                if (e1.getSalary() == e2.getSalary()) return 0;
                else if (e1.getSalary() < e2.getSalary()) return -1;
                else return 1;
            }
        });
        System.out.println("Sorted by salary: " + employeeList);
    }
}
