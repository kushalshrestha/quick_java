package quick_java.lesson8.prob3;

import java.util.function.Predicate;

public class MyClass {
	int x;
	String y;

	public MyClass(int x, String y) {
		this.x = x;
		this.y = y;
	}

	public void myMethod(MyClass cl) {
//		Predicate<MyClass> checkEq = obj -> this.equals(obj);	//lambda expression
		Predicate<MyClass> checkEq = this::equals; 
		System.out.println(checkEq.test(cl));
	}

	@Override
	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (ob.getClass() != getClass())
			return false;
		MyClass mc = (MyClass) ob;
		return mc.x == x && mc.y.equals(y);
	}

	public static void main(String[] args) {
		MyClass myclass = new MyClass(1, "A");
		MyClass myclass1 = new MyClass(1, "B");
		myclass.myMethod(myclass);
		myclass.myMethod(myclass1);
	}
}
