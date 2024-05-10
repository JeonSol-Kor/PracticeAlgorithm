import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double sumCredit = 0;
		double sumScore = 0;
		for (int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String subject = st.nextToken();
			double credit = Double.parseDouble(st.nextToken());
			double score = 0;
			String grade = st.nextToken();

			switch (grade) {
				case "A+":
					score = 4.5;
					break;
				case "A0":
					score = 4.0;
					break;
				case "B+":
					score = 3.5;
					break;
				case "B0":
					score = 3.0;
					break;
				case "C+":
					score = 2.5;
					break;
				case "C0":
					score = 2.0;
					break;
				case "D+":
					score = 1.5;
					break;
				case "D0":
					score = 1.0;
					break;
				case "F":
					score = 0;
					break;
			}
			if (!grade.equals("P")) {
				sumCredit += credit;
				sumScore += score * credit;
			}
		}
		System.out.println(sumScore / sumCredit);
	}
}