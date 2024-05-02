import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int longN = (int) N / 4;
		for (int i = 1; i <= longN; i++) {
			System.out.print("long ");
		}

		System.out.println("int");
	}
}