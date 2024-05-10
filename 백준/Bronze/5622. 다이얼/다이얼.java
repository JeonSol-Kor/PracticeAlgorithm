import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char word = input.charAt(i);
			if (word == 'A' || word == 'B' || word == 'C') {
				sum += 3;
			} else if (word == 'D' || word == 'E' || word == 'F') {
				sum += 4;
			} else if (word == 'G' || word == 'H' || word == 'I') {
				sum += 5;
			} else if (word == 'J' || word == 'K' || word == 'L') {
				sum += 6;
			} else if (word == 'M' || word == 'N' || word == 'O') {
				sum += 7;
			} else if (word == 'P' || word == 'Q' || word == 'R' || word == 'S') {
				sum += 8;
			} else if (word == 'T' || word == 'U' || word == 'V') {
				sum += 9;
			} else if (word == 'W' || word == 'X' || word == 'Y' || word == 'Z') {
				sum += 10;
			}
		}
		System.out.println(sum);
	}
}