import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[] music = new int[8];
		String output = "";
		for (int i = 0; i < 8; i++) {
			music[i] = sc.nextInt();
			if (music[0] == 1) {
				if (music[i] != i + 1) {
					output = "mixed";
					break;
				} else {
					output = "ascending";
				}
			} else if (music[0] == 8) {
				if (music[i] != 8 - i) {
					output = "mixed";
					break;
				} else {
					output = "descending";
				}
			} else {
				output = "mixed";
			}
		}
		sc.close();
		System.out.println(output);
	}
}