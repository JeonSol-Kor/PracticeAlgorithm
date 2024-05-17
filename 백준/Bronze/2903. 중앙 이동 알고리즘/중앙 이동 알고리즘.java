import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int dot = 2;
		for (int i = 0; i < N; i++) {
			dot += dot - 1;
		}

		System.out.println(dot * dot);
	}
}