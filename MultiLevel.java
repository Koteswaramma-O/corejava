class A {
	void method() {
		System.out.println("A class method");
	}
}
class B extends A {
	void method() {
		System.out.println("B class method");
	}
}
public class MultiLevel extends B {
	public static void main(String[] args) {
		MultiLevel obj = new MultiLevel();
		obj.method();
		A obj1 = new A();

		obj1.method();

	}
}
