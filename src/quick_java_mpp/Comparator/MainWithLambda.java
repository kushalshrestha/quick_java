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

public class MainWithLambda {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ram", 2000));
        employeeList.add(new Employee("Hari", 1000));
        employeeList.add(new Employee("Shyam", 4000));
        employeeList.add(new Employee("Anil", 5000));


        EmployeeInfo1 ei = new EmployeeInfo1();
        ei.sort(employeeList, EmployeeInfo1.SortMethod.BYNAME);
        System.out.println(employeeList);

        ei.sort(employeeList, EmployeeInfo1.SortMethod.BYSALARY);
        System.out.println(employeeList);
    }
}

class EmployeeInfo1 {
    static enum SortMethod {BYNAME, BYSALARY};


    public void sort(List<Employee> employeeList, SortMethod methodName) {

        // local class. Closure: Employee Comparator. The comparator captures 'employeeList' & 'methodName'.
//        class EmployeeComparator implements Comparator<Employee> {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                if (methodName == SortMethod.BYNAME) {
//                    return e1.getName()
//                             .compareTo(e2.getName());
//                } else {
//                    if (e1.getSalary() == e2.getSalary()) return 0;
//                    else if (e1.getSalary() < e2.getSalary()) return -1;
//                    else return 1;
//                }
//            }
//        }
//        Collections.sort(employeeList, new EmployeeComparator());

        // ALTERNATIVE WAY BY USING LAMBDAS
        Collections.sort(employeeList, (e1, e2) -> {
            if (methodName == SortMethod.BYNAME) {
                return e1.getName()
                         .compareTo(e2.getName());
            } else {
                if (e1.getSalary() == e2.getSalary()) return 0;
                else if (e1.getSalary() < e2.getSalary()) return -1;
                else return 1;
            }
        });
    }
}
