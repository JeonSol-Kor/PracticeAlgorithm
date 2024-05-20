import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		sc.close();

		double days = Math.ceil((double) (V - B) / (A - B));
		System.out.println((int) days);
	}
}