import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N == 1) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			System.out.println(0);
		} else {
			int minX = 10001;
			int minY = 10001;
			int maxX = -10001;
			int maxY = -10001;
			for (int i = 0; i < N; i++) {
				int X = sc.nextInt();
				int Y = sc.nextInt();
				if (X < minX)
					minX = X;
				if (X > maxX)
					maxX = X;
				if (Y < minY)
					minY = Y;
				if (Y > maxY)
					maxY = Y;
			}
			System.out.println((maxX - minX) * (maxY - minY));
		}
		sc.close();
	}
}