import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();

			if (A == 0 || B == 0 || C == 0)
				break;
			else {
				String output = "";
				int maxV = Math.max(A, B);
				maxV = Math.max(maxV, C);

				if (maxV >= A + B || maxV >= B + C || maxV >= C + A)
					output = "Invalid";
				else if (A == B && B == C && C == A)
					output = "Equilateral";
				else if (A == B || B == C || C == A)
					output = "Isosceles";
				else
					output = "Scalene";

				System.out.println(output);
			}
		}
		sc.close();
	}
}