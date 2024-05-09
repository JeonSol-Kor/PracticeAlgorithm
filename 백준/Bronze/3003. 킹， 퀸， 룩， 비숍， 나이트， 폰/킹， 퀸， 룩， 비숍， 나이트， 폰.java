import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[] oldChess = { 1, 1, 2, 2, 2, 8 };
		int[] inputChess = new int[6];

		for (int i = 0; i < 6; i++) {
			inputChess[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < 6; i++) {
			System.out.print(oldChess[i] - inputChess[i] + " ");
		}

	}
}