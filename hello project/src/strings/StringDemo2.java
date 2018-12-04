package strings;

public class StringDemo2 {
	public static void main(String[] args) {
		String str = "Hello";

		String str2 = str.concat(" World!");
		System.out.println(str.equals(str2));
		System.out.println(str == str2);

		// String is immutable: once string object
		// created, can't be modified
	}
}
