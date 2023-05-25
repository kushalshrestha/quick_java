/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_fpp.fundamental.localclasses;

/**
 * Local Class: PhoneNumberAsLocalClass
 * See how the member variable is accessed. i.e Member variable of the class can be accessed although local class is
 * inside a method.
 * Local class within a static method can't access non-static method of a outer class
 */
public class LocalClassExample1 {
    static String regularExpression = "[^0-9]";
    String nonStaticVariable = "Won't be accessed by local class within a static method";

    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {
//        final int numberLength = 10;
        // Valid in JDK 8 and later:
        int numberLength = 10;

        //inner class
        class PhoneNumberAsLocalClass {
            String formattedPhoneNumber = null;

            PhoneNumberAsLocalClass(String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll(regularExpression, "");

                // can't access non-static variable
//                System.out.println(test); // Compile error: cannot find symbol(variable test)
                if (currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

            // Valid in JDK 8 and later:
            public void printOriginalNumbers() {
                System.out.println("Original numbers are " + phoneNumber1 + " and " + phoneNumber2);
            }
        }

        PhoneNumberAsLocalClass myNumber1 = new PhoneNumberAsLocalClass(phoneNumber1);
        PhoneNumberAsLocalClass myNumber2 = new PhoneNumberAsLocalClass(phoneNumber2);
        // Valid in JDK 8 and later:
        myNumber1.printOriginalNumbers();

        if (myNumber1.getNumber() == null)
            System.out.println("First number is invalid");
        else
            System.out.println("First number is " + myNumber1.getNumber());
        if (myNumber2.getNumber() == null)
            System.out.println("Second number is invalid");
        else
            System.out.println("Second number is " + myNumber2.getNumber());
    }

    public static void main(String... args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }
}