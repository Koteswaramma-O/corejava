//Hybrid Inheritance
//Multiple Inheritance
class C {
public void disp() {
	System.out.println("C");
	}
}

interface A1 {

	public void method1();

}

interface B1 {
	public void method2();

}

class D extends C implements A1, B1 {
	public void method2() {
	System.out.println("Method2");

	}
	public void method1() {
	System.out.println("Methods2");

	}
	public static void main(String args[]) {
	C obj = new C();
	obj.disp();
	D objd = new D();
objd.method1();
	objd.method2();

	}

}
