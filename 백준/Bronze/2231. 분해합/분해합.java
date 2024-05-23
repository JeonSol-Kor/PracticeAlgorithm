import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int M = 0;
		for (int i = 1; i < N; i++) {
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