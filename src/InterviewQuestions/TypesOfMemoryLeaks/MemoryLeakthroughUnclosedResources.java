/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewQuestions.TypesOfMemoryLeaks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Whenever we make a new connection or open a stream, the JVM allocates memory for these resources. Eg:
 * Database Connection, Input Streams, Session objects
 * Forgetting to close these resources can block the memory, thus keeping them out of the reach of the Garbage Collector
 * */
public class MemoryLeakthroughUnclosedResources {
    public static void main(String[] args) throws IOException {
        withoutClosingTheResource();
        closingTheResource();

    }

    private static void closingTheResource() {
        try (BufferedReader reader = new BufferedReader(new FileReader("resources/student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void withoutClosingTheResource() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("resources/student.txt"));
        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
