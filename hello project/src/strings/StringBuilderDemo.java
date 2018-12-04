package strings;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("World!");
		System.out.println(sb);
		System.out.println(sb.delete(6, 10));
//		System.out.println(sb);
	}
}