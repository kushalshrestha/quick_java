package quick_java_fpp.objects_classes;

import static quick_java_fpp.objects_classes.Label.RIGHT;

public class Main {
    public static void main(String[] args) {
        System.out.println("Object");

        Label l = new Label("Hi Kushal!", Label.RIGHT);
        int i = l.getAlignment();
        System.out.println(l.getText());
        System.out.println(l.getAlignment());

        Label l2 = l; // Assigning to an already existing object variable
        System.out.println(l2.getText());
        l2.setText("Updated message: Hello Kush!");
        System.out.println(l.getText());
        System.out.println(l2.getText());
        System.out.println("NOTE: Both object instances have been updated, because the reference is same. i.e l1 (object variable) holds the reference not the value");
    }
}
