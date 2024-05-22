import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			if (N % H == 0) {
				System.out.println(100 * H + (int) (N / H));
			} else {
				System.out.println((N % H) * 100 + (int) (N / H) + 1);
			}
		}
		sc.close();
	}
}