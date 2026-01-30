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

/**
 * could you write a program or logic where you're given Customer List,
 * Customer has score and score can contain numbers and 0s as well. Output should have all customer with 0's coming in
 * the last.
 * Input: [3,5,-2, 0 , 0 ,2 ,-100]
 * List<Customer> cList = Arrays.asList(
 *                 new Customer("Messi", 0),
 *                 new Customer("Anil", 11),
 *                 new Customer("Kushal", 10),
 *                 new Customer("Mbappe", 0),
 *                 new Customer("Ram", 11)
 *         );
 *
 * Output:
 * Customer{name='Anil', score=11}
 * Customer{name='Kushal', score=10}
 * Customer{name='Ram', score=11}
 * Customer{name='Messi', score=0}
 * Customer{name='Mbappe', score=0}
 */
public class ZeroArrangedCustomer {
    public static void main(String[] args) {
        List<Customer> cList = Arrays.asList(
                new Customer("Messi", 0),
                new Customer("Anil", 11),
                new Customer("Kushal", 10),
                new Customer("Mbappe", 0),
                new Customer("Ram", 11)
        );

        moveZeroRankingCustomersToEnd(cList);

        cList.forEach(System.out::println);

        cList.forEach(customer -> System.out.println(customer));

        List<Customer> cList1 = Arrays.asList(
                new Customer("Messi", 0),
                new Customer("Anil", 11),
                new Customer("Kushal", 10),
                new Customer("Mbappe", 0),
                new Customer("Ram", 11)
        );

        List<Customer> updatedCList = moveZeroRankingStream(cList1);
        updatedCList.forEach(c -> System.out.println(c));
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

    private static List<Customer> moveZeroRankingStream(List<Customer> customers) {
        var nonZero = customers.stream()
                .filter(c -> c.getScore() != 0)
                .toList();

        var zeros = customers.stream()
                .filter(c -> c.getScore() == 0)
                .toList();

        List<Customer> result = new ArrayList<>();
        result.addAll(nonZero);
        result.addAll(zeros);
        return result;
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