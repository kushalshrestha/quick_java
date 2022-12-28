package quick_java_fpp.fundamental;

public class Fundamentals {
    public static void main(String[] args) {
        float x = 2.3456F;
        float y = 2.3456F;
        double x1 = 2.3456;
        double y1 = 2.3456;
        System.out.println(x + y);
        System.out.println(x1 + y1);
        System.out.println("Now, when multiplied, Makes a difference");
        System.out.println("i.e The float type in Java does not accurately represent numbers with more than 7 digits");
        System.out.println(x * y);
        System.out.println(x1 * y1);

        System.out.println("Double data types - add, subtract makes a difference");
        double a = 0.7;
        double b = 0.9;
        double c = a + 0.1;
        double d = b - 0.1;
        System.out.println(c);
        System.out.println(d);

        System.out.println("Arithmetic Operations - difference to noticeable");
        System.out.println("(-5) / 2 = " + (-5) / 2);
        System.out.println("(-5) % 2 = " + (-5) % 2);
        System.out.println("================================================================");;
        System.out.println("Above way of calculating modulus is an old mistake. Modulus is always a non negative number as per the usual mathematical definition of modulus.\nHere's the JAVA 8 correction");
        System.out.println("Explanation : n = m * q + r \n i.e -5 = 2 * -3 + 1");
        System.out.println("Math.floorDiv(-5,2) : " + Math.floorDiv(-5,2));
        System.out.println("Math.floorMod(-5,2) : " + Math.floorMod(-5,2));

        System.out.println("================================================================");
        System.out.println("Increment and Decrement Operators");
        int k = 1;
        System.out.println(k++); // prints '1' and new value of k is 2 (postfix - value is after evaluation)
        System.out.println(++k); // prints '3' and new value of k is 3 (prefix - value is before evaluation)

        byte x2 = 15;
        byte y2 = 7;
        int z2 = x2 + y2;
        System.out.println(z2);

    }
}
