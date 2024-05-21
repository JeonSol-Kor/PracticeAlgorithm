import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();

		if (A + B + C != 180) {
			System.out.println("Error");
		} else if (A == B && B == C && C == A) {
			System.out.println("Equilateral");
		} else if (A == B || B == C || C == A) {
			System.out.println("Isosceles");
		} else {
			System.out.println("Scalene");
		}
	}
}