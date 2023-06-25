/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_mpp.Comparator;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(
            Employee e1,
            Employee e2
    ) {
        if (e1.getSalary() == e2.getSalary()) return 0;
        else if (e1.getSalary() < e2.getSalary()) return -1;
        else return 1;
    }
}
