import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int score = 0;
			int extra = 0;
			String OX = sc.next();
			String[] listOX = OX.split("");
			for (int j = 0; j < listOX.length; j++) {
				if (listOX[j].equals("O")) {
					if (j != 0) {
						if (listOX[j - 1].equals("O")) {
							extra++;
							score += extra;
						}
					}
					score++;
				} else {
					extra = 0;
				}
			}
			System.out.println(score);
		}
		sc.close();
	}
}