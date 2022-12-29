package quick_java_fpp.fundamental;


import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name: ");
        System.out.println("You wrote: " + sc.nextLine());
        System.out.println("Type your age");
        System.out.println("You age: " + sc.nextInt());
        sc.close();
    }
}
