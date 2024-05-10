import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		sc.close();

		int[] positions = new int[26];

		for (int i = 0; i < positions.length; i++) {
			positions[i] = -1;
		}

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int index = ch - 'a';
			if (positions[index] == -1) {
				positions[index] = i;
			}
		}

		for (int position : positions) {
			System.out.print(position + " ");
		}
	}
}