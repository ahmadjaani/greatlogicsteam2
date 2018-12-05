import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int[] arr = new int[-11];
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a/b);	//ArithmeticException
	}
}

//unchecked exception: ex: ArithmeticException, NullPointerException, NegativeArraySizeException
//Any exception that extends from RuntimeException is called as unchecked
//Any exception that extends from Exception is called checked