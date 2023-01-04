package quick_java_fpp.stack_queue;

public class Main {

    public static void main(String[] args) {
        StackUsingArray sua = new StackUsingArray();
        sua.push(1);
        sua.push(2);
        sua.push(3);
        sua.push(4);
        sua.push(5);
        sua.peek();
        sua.push(6);
        sua.push(7);
        sua.push(8);
        sua.pop();
        sua.peek();
    }
}
