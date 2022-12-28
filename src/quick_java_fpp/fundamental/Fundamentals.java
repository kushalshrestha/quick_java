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
    }
}
