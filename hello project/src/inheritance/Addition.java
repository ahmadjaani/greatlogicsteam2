package inheritance;

public class Addition {
//	method overloading
	
	public void add(int i,int j) {
		System.out.println("int, int "+(i+j));
	}
	
	public void add(double d,double f) {
		System.out.println("double, double "+(d+f));
	}
	
	public static void main(String[] args) {
		Addition parent = new Addition();
		parent.add(11.5, 22.5);
	}
}
