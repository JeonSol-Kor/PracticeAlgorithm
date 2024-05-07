import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();
		int index = sc.nextInt();

		sc.close();

		System.out.println(word.charAt(index - 1));

	}
}