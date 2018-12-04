package strings;

public class StringDemo {
	public static void main(String[] args) {
		String str = "welcome!!!";
		String str2 = new String("welcome!!!");
		String str3 = "welcome!!!";
		System.out.println(str2.equals(str));
		System.out.println(str == str3);
	}
}
