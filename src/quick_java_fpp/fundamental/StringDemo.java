package quick_java_fpp.fundamental;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println("String Functions Demo");
        String s = "Hello World";
        String sub = "Hel";
        System.out.println(s);
        System.out.println("To find length of a string -> s.length() : " + s.length());
        System.out.println("================================================================");
        System.out.println("Substring");
        System.out.println("================================================================");
        System.out.println("To find substring of a character -> s.substring(m,n) : " + s.substring(0, 4));
        System.out.println("s.substring(0, 0) : " + s.substring(0, 0));
        System.out.println("s.substring(0, 2) : " + s.substring(0, 2));
        System.out.println("s.substring(1, 2) : " + s.substring(1, 2));
        System.out.println("s.substring(0, s.length()) : " + s.substring(0, s.length()));
        System.out.println("================================================================");
        System.out.println("To return position (first occurrence) of character in String -> s.index() : " + s.indexOf('l'));
        System.out.println("To check if String begins with the String 'h' -> s.startsWith(String s) : " + s.startsWith("Hel"));
        System.out.println("To check if two strings are identical -> s.equals(String s) : " + s.equals("Hello World"));
        System.out.println("================================================================");
        System.out.println("startsWith");
        System.out.println("================================================================");
        System.out.println("s.startsWith(\"Hello\") : " + s.startsWith("Hello"));
        System.out.println("s.startsWith(\"H\") : " + s.startsWith("H"));
        System.out.println("================================================================");
        System.out.println("String Object Vs String Literal");
        System.out.println("================================================================");
        System.out.println("* new operator stores a string objects in a heap memory");
        System.out.println("* Literals are stored in a String pool(Runtime constant pool in method area) to minimize the memory usage and for better performance");
        String str1 = "Hello";
        String str2 = "He" + "llo";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        String str5 = str4;
        String str6 = "He";
        String str7 = str6 + "llo";
        String str8 = str7.intern();
        System.out.println("String str1 = \"Hello\"");
        System.out.println("String str2 = \"He\" + \"llo\"");
        System.out.println("String str3 = new String(\"Hello\")");
        System.out.println("String str4 = new String(\"Hello\")");
        System.out.println("String str5 = str4");
        System.out.println("String str6 = \"He\"");
        System.out.println("String str7 = str6 + \"llo\"");
        System.out.println("String str8 = str7.intern()");
        System.out.println("String str1 = \"Hello\"");
        System.out.println("String str1 = \"Hello\"");
        System.out.println("------------------------OUTPUT------------------------");
        System.out.println(new StringBuilder("str1 == str2 --> ").append(str1 == str2).toString());
        System.out.println(new StringBuilder("str2 == str3 --> ").append(str2 == str3).toString());
        System.out.println(new StringBuilder("str3 == str4 --> ").append(str3 == str4).toString());
        System.out.println(new StringBuilder("str4 == str5 --> ").append(str4 == str5).toString());
        System.out.println(new StringBuilder("str1 == str7 --> ").append(str1 == str7).toString());
        System.out.println(new StringBuilder("str1 == str8 --> ").append(str1 == str8).toString());
        System.out.println("----------------------------------------------------------------");


    }
}
