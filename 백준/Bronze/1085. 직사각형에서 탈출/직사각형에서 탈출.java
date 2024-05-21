import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		sc.close();
		int min = 1001;
		int[] distances = { w - x, h - y, x, y };
		for (int distance : distances) {
			if (min > distance) {
				min = distance;
			}
		}
		System.out.println(min);
	}
}