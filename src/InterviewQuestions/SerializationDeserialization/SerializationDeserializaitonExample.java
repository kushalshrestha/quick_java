/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package InterviewQuestions.SerializationDeserialization;

import java.io.*;

/**
 *
 * If used in try/catch block, An FileInputStream and a BufferedInputStream, both of these resources will be closed
 * automatically when execution
 * leaves the try block.
 * */
public class SerializationDeserializaitonExample {
    public static void main(String[] args) {
        // Object to be serialized
        Student student = new Student("John Doe", 25, "Computer Science");

        try {
            // Serialization - Writing object to a file
            FileOutputStream fileOut = new FileOutputStream("resources/student.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(student);
            objectOut.close();
            fileOut.close();
            System.out.println("Object serialized and written to file.");

            // Deserialization - Reading object from a file
            FileInputStream fileIn = new FileInputStream("resources/student.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Student deserializedStudent = (Student) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Object deserialized from file.");
            System.out.println("Name: " + deserializedStudent.getName());
            System.out.println("Age: " + deserializedStudent.getAge());
            System.out.println("Major: " + deserializedStudent.getMajor());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


// Serializable class
class Student implements Serializable {
    private String name;
    private int age;
    private String major;

    public Student(
            String name,
            int age,
            String major
    ) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
