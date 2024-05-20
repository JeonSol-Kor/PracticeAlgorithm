import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		while (A != 0 && B != 0) {
			if (A > B) {
				if (A % B == 0) {
					System.out.println("multiple");
				} else {
					System.out.println("neither");
				}
			} else {
				if (B % A == 0) {
					System.out.println("factor");
				} else {
					System.out.println("neither");
				}
			}
			A = sc.nextInt();
			B = sc.nextInt();
		}
		sc.close();
	}
}