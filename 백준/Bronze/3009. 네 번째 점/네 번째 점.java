import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		sc.close();
		int x = x1;
		int y = y1;

		if (x == x2) {
			x = x3;
		} else if (x == x3) {
			x = x2;
		}

		if (y == y2) {
			y = y3;
		} else if (y == y3) {
			y = y2;
		}

		System.out.println(x + " " + y);
	}
}