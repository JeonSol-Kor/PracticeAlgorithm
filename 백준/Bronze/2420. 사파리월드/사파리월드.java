import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		sc.close();
		System.out.println(Math.abs(N - M));
	}
}