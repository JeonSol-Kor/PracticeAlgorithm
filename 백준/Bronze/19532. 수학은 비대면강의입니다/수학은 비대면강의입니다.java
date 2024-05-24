import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		sc.close();
		int x;
		int y;
		if (a == 0) {
			y = c / b;
			x = (c * e - b * f) / (a * e - b * d);
		} else if (b == 0) {
			x = c / a;
			y = (c * d - f * a) / (b * d - e * a);
		} else if (d == 0) {
			y = f / e;
			x = (c * e - b * f) / (a * e - b * d);

		} else if (e == 0) {
			x = f / d;
			y = (c * d - f * a) / (b * d - e * a);
		} else {
			y = (c * d - f * a) / (b * d - e * a);
			x = (c - b * y) / a;
		}
		System.out.println(x + " " + y);
	}
}