/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * Linkedin : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package quick_java_fpp.fundamental;


/*
Tags: PassByValue, PassByReference
* Primitive variables (8 primitive data types) store "actual values". When any variable of primitive data type is passed
as an argument, the actual parameters are copied to formal arguments and these arguments accumulate their own space in
stack memory. Lifespan of parameters lasts only as long as that method is running.
* Non-Primitives store the "reference variables" which point to the addresses of the object's they're referring to.
* Objects are passed by reference. when an object is passed as a parameter to a method, the method receives a reference
to the object, rather than a copy of the object itself.
* Both values and references are stored in stack memory.
*
 */
public class PassByValuePassByReference {
    public static void main(String[] args) {
        System.out.println("For Primitive types, parameters are pass-by-value\n" +
                "For Object types, the object reference is pass-by-value");
        System.out.println("==========");
        primitiveModifiedThenOriginalValuesNotModified();
        System.out.println("=========");
        nonPrimitiveModifiedThenOriginalValuesModified();
    }

    private static void primitiveModifiedThenOriginalValuesNotModified() {
        System.out.println("we declare an int variable number with an initial value of 10. We then call the changeNumber method and pass number as an argument. Inside the method, we assign the value 20 to the parameter number. However, this does not change the original value of number outside the method, which remains 10.");
        int number = 10;
        System.out.println("Original value of number: " + number);
        changeNumber(number);
        System.out.println("Value of number after method call: " + number);
    }

    public static void changeNumber(int number) {
        number = 20;
        System.out.println("Value of number inside method: " + number);
    }

    private static void nonPrimitiveModifiedThenOriginalValuesModified() {
        System.out.println("we declare a StringBuilder object sb and initialize it with the value \"Hello\". We then call the changeStringBuilder method and pass sb as an argument. Inside the method, we append the string \" world\" to sb, which modifies the original object. When we print the value of sb outside the method, we can see that it has been modified to \"Hello world\". This demonstrates that sb was passed by reference to the changeStringBuilder method.");
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original value of sb: " + sb);

        changeStringBuilder(sb);
        System.out.println("Value of sb after method call: " + sb);

    }

    public static void changeStringBuilder(StringBuilder sb) {
        sb.append(" world");
        System.out.println("Value of sb inside method: " + sb);
    }
}
