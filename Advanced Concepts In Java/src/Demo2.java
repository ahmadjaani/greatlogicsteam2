import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) {
		File file = new File("G://greatlogics.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			fos.write("Hi All, GreatLogics is a great platform to shape your career!".getBytes());
			System.out.println("File created successfully!");
			fos.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block Runs Always!");
		}
	}
}
