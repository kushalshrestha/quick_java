/*
 * Copyright (c) 2026.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package problem_solving.warmup_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DescendingByRanking {
    public static void main(String[] args) {
        List<Student> cList = new ArrayList<Student>();
        cList.add(new Student("A", 12));
        cList.add(new Student("C", 15));
        cList.add(new Student("B", 112));
        cList.add(new Student("D", 0));

        List<Student> sortedList = descendingByRanking(cList);

        sortedList.forEach(System.out::println);

    }

    private static List<Student> descendingByRanking(List<Student> cList) {
        return cList.stream()
                    .sorted(Comparator.comparing(Student::getScore).reversed())
                .toList();
    }

}

class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return this.name;
    }

    public int getScore(){
        return this.score;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString(){
        return "Student (name=" + name + ", score=" + score + ")";
    }
}
