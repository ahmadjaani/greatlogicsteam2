import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) throws AccountNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Account Number");
		long acno = sc.nextLong();
		if(acno>100000)
			System.out.println("Valid Account Number");
		else
			throw new AccountNotFoundException("Invalid Account Number");
	}
}
