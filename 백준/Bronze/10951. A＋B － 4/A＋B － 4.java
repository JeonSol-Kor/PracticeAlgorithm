import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		do {
			String line = br.readLine();
			if (line == null || line.isEmpty()) {
				break;
			}

			String[] input = line.split(" ");

			int A = Integer.parseInt(input[0]);
			int B = Integer.parseInt(input[1]);

			if (A < 0 || B < 0 || A > 10 || B > 10) {
				break;
			} else {
				bw.write((A + B) + "\n");
			}

		} while (true);

		bw.flush();
		bw.close();
		br.close();
	}
}