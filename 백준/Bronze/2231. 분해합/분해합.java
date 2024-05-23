import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String strN = sc.next();
		sc.close();
		int N = Integer.parseInt(strN);
		int min = N - strN.length() * 9;
		if (min < 1) {
			min = 1;
		}
		int M = 0;
		for (int i = min; i < N; i++) {
			int check = i;
			int test = i;
			while (check > 0) {
				test += check % 10;
				check /= 10;
			}
			if (test == N) {
				M = i;
				break;
			}
		}
		System.out.println(M);
	}
}