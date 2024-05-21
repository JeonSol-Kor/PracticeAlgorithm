import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		ArrayList<Integer> aliquots = new ArrayList<>();
		int cpN = N;
		for (int i = 2; i < N + 1; i++) {
			while (cpN % i == 0) {
				cpN = cpN / i;
				aliquots.add(i);
			}
			if (cpN == 1)
				break;
		}
		for (int aliquot : aliquots) {
			System.out.println(aliquot);
		}
	}
}