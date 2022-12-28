package quick_java_fpp.fundamental;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println("StringDemo");
        String s = "Hello World";
        System.out.println(s);
        System.out.println("To find length of a string -> length() : " + s.length());
        System.out.println("To find substring of a character -> substring(m,n) : " + s.substring(0,4));
        System.out.println("To return position (first occurrence) of character in String -> index() : " + s.indexOf('l'));
    }
}
