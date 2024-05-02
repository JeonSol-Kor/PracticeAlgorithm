import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();
		if (X > 0 && Y > 0) {
			System.out.println("1");
		} else if (X < 0 && Y > 0) {
			System.out.println("2");
		} else if (X < 0 && Y < 0) {
			System.out.println("3");
		} else if (X > 0 && Y < 0) {
			System.out.println("4");
		}
	}
}