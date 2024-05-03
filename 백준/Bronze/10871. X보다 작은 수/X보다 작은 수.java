import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());

		br.close();

		int N = Integer.parseInt(st1.nextToken());
		int X = Integer.parseInt(st1.nextToken());

		int[] numbers = new int[N];

		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st2.nextToken());
		}

		String ouput = "";

		for (int number : numbers) {
			if (number < X) {
				ouput += number + " ";
			}
		}

		ouput = ouput.substring(0, ouput.length() - 1);

		System.out.println(ouput);
	}
}