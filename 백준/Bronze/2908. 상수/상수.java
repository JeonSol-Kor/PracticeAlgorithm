import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		sc.close();
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int hundA = (int) (A / 100);
		int deciA = (int) (A / 10) - hundA * 10;
		int oneA = A - hundA * 100 - deciA * 10;
		int newA = hundA + deciA * 10 + oneA * 100;

		int hundB = (int) (B / 100);
		int deciB = (int) (B / 10) - hundB * 10;
		int oneB = B - hundB * 100 - deciB * 10;
		int newB = hundB + deciB * 10 + oneB * 100;

		if (newA > newB) {
			System.out.println(newA);
		} else {
			System.out.println(newB);
		}
	}
}