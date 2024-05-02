import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		sc.close();

		if (dice1 == dice2 && dice2 == dice3 && dice3 == dice1) {
			System.out.println(10000 + dice1 * 1000);
		} else if (dice1 == dice2 || dice2 == dice3 || dice3 == dice1) {
			if (dice1 == dice2 || dice3 == dice1) {
				System.out.println(1000 + dice1 * 100);
			} else {
				System.out.println(1000 + dice2 * 100);
			}
		} else {
			int max = dice1;
			if (dice2 > max) {
				max = dice2;
			}
			if (dice3 > max) {
				max = dice3;
			}
			System.out.println(max * 100);
		}
	}
}