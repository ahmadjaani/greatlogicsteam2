package inheritance;

public class Child extends Parent {

	
//	  public Child(int i, int j) { super(i, j); }
	 
	
	
	@Override
	public void m1() {
		System.out.println("m1 method overridden into child");
	}

	public void m2() {
		System.out.println("m2 of Child");
	}
}