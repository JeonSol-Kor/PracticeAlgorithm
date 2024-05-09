import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();

		String[] output = new String[T];

		Arrays.fill(output, "");

		for (int i = 0; i < T; i++) {
			String RS = sc.nextLine();
			String[] RSsep = RS.split(" ");
			int R = Integer.parseInt(RSsep[0]);
			String S = RSsep[1];

			for (int j = 0; j < S.length(); j++) {
				if (S.charAt(j) == '\\') {
					for (int k = 0; k < R; k++) {
						output[i] += S.charAt(j);
					}
				} else {
					for (int k = 0; k < R; k++) {
						output[i] += S.charAt(j);
					}
				}
			}

			System.out.println(output[i]);
		}
		sc.close();

	}
}