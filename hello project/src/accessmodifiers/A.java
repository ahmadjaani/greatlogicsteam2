package accessmodifiers;

public class A {
	private int i = 11;
	protected byte b = 12;
	long c = 13;// package-private

	public void show() {
		System.out.println(i + " " + b + " " + c);
	}
}

class B {
	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.c);
//		System.out.println(obj.i);
		System.out.println(obj.b);
	}
}