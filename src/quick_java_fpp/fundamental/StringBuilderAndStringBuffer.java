package quick_java_fpp.fundamental;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        System.out.println("* Concatenation becomes very slow with many arguments because each concatenation creates a new String (which requires allocation new memory for the new object), and compared to other steps, this is a costly operation.");
        System.out.println("* StringBuilder is designed to be used for single-threaded applications - it is not thread safe. This means that a single StringBuilder instance must not be shared between two or more competing threads.");
        System.out.println("* If multithreaded access is needed, a class with the same method names, StringBuffer, can be used, but it is less efficient in the single-threaded case");
        System.out.println("* StringBuilder and StringBuffer are mutable");
        System.out.println("Example : ");

        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        sb.append("world");
        sb.append("!");
        System.out.println(sb.toString());
    }
}
