import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < T; i++) {
			String word = sc.nextLine();
			System.out.println(word.charAt(0) + "" + word.charAt(word.length() - 1));
		}

		sc.close();
	}
}