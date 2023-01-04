package quick_java_fpp.nested_classes;

/**
 * Member Inner Class Examples
 */
public class OuterClass {

    private int x = 10;
    private String outerThis = "Outer this!!!";

    OuterClass() {
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.innerVariable);
        innerClass.innerClassMethod();
        System.out.println(innerClass.innerThis);
        System.out.println(this.outerThis);
    }

    public class InnerClass {
        private int innerVariable = 3;
        private String innerThis = "Inner this!!!";

        public void innerClassMethod() {
            System.out.println("This is inner class method");
            System.out.println("Value of x is : " + x);
            System.out.println(OuterClass.this.outerThis);
        }
    }

    public static void main(String[] args) {
        new OuterClass();
    }
}
