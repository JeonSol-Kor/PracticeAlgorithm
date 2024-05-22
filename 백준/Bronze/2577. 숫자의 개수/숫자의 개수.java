import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		sc.close();
		long multi = A * B * C;
		String multiStr = multi + "";
		String[] listMultiStr = multiStr.split("");
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (String number : listMultiStr) {
				if (number.equals(String.valueOf(i))) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}