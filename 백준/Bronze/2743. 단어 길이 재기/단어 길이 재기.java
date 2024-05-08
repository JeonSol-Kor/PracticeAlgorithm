import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();

		sc.close();

		System.out.println(word.length());
	}
}