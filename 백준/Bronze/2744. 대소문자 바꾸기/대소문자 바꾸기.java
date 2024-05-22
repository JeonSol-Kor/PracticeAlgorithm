import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		sc.close();
		String output = "";
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i)))
				output += Character.toLowerCase(word.charAt(i));
			else
				output += Character.toUpperCase(word.charAt(i));

		}
		System.out.println(output);
	}
}