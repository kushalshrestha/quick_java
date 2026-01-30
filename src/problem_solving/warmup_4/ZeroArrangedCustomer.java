/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroArrangedCustomer {
    public static void main(String[] args) {
        List<Customer> cList = Arrays.asList(
                new Customer("Messi", 0),
                new Customer("Anil", 11),
                new Customer("Kushal", 10),
                new Customer("Mbappe", 0),
                new Customer("Anil", 11)
        );

        moveZeroRankingCustomersToEnd(cList);

        cList.forEach(System.out::println);

        cList.forEach(customer -> System.out.println(customer));
    }

    private static void moveZeroRankingCustomersToEnd(List<Customer> customers) {

        List<Customer> zeroRankCustomers = new ArrayList<>();
        int write = 0;

        //Moving non-zero ranking customers forward
        for (Customer customer:customers){
            if(customer.getScore() != 0) {
                customers.set(write++, customer);
            } else {
                zeroRankCustomers.add(customer);
            }
        }

        // Appending zero-ranking customers at the end
        for (Customer customer : zeroRankCustomers) {
            customers.set(write++, customer);
        }
    }
}

class Customer {
    String name;
    int score;

    public Customer(
            String name,
            int score
    ) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore(){
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score){
        this.score = score;
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + ", score=" + score + '}';
    }
}