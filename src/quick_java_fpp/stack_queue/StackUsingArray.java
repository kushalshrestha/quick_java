package quick_java_fpp.stack_queue;

public class StackUsingArray {
    private static final int LEN = 500;
    private int top = -1;
    private int nextOpen = 0;
    private Integer[] arr = new Integer[LEN];

    public void push(Integer x) {
        if (x == null) return;
        arr[nextOpen] = x;
        top++;
        nextOpen++;
        System.out.println("Number pushed into stack : " + x);
    }

    public Integer peek() {
        System.out.println("Current number at top of stack : " + arr[top]);
        return (top == -1) ? null : arr[top];
    }

    public Integer pop() {
        Integer ret = peek();
        if (ret != null) {
            arr[top] = null;
            top--;
            nextOpen--;
        }
        System.out.println("Number poped from stack : " + ret);
        return ret;
    }
}
