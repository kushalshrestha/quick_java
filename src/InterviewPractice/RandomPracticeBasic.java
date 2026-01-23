/*
 * Copyright (c) 2025.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewPractice;

import quick_java_mpp.Comparator.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.*;

public class RandomPracticeBasic {
    public static void main(String[] args) {
        List<Integer> cList = List.of(2,3,4,5,6,7,8,9);
        List<Integer> evenNumbers = cList.stream()
                .filter(n -> n%2 == 0)
                .toList();
        System.out.println(evenNumbers);

        // Mutable list of employees
        List<Employee> employeeList = new ArrayList<>(List.of(
                new Employee("kushal", 12312),
                new Employee("atest", 32432432)
        ));

        Collections.sort(employeeList, new EmployeeNameComparator());
        System.out.println(employeeList);

        List<Employee> employeeList1= List.of(
                new Employee("kushal", 12312),
                new Employee("atest", 32432432)
        );



        int[] numbers = {5,2,3,8,1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        /* Sorting Arraylist */
        List<String> nameList = new ArrayList<>();
        nameList.add("Kushal");
        nameList.add("Anil");
        Collections.sort(nameList);
        System.out.println(nameList);

        int a = 5;
        int b = 1;
        System.out.println("a: " + a + " b: " + b);

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a: " + a + " b: " + b);


        String text = "Find all the words separated by whitespaces";
        String[] words = text.split("\\s+");
        for(String word: words){
            System.out.println(word);
        }

        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println(reversed);


    }
}


class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2){
        return e1.getName().compareTo(e2.getName());
    }
}
