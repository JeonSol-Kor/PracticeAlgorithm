import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean condition = true;
		do {
			String[] input = br.readLine().split(" ");

			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);

			if (A == 0 && B == 0) {
				condition = false;
				break;
			} else {
				bw.write((A + B) + "\n");
			}

		} while (condition);

		bw.flush();
		bw.close();
		br.close();
	}
}