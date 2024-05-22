import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a0 = sc.nextInt();
		int c = sc.nextInt();
		int n0 = sc.nextInt();
		sc.close();

		if (a1 > c)
			System.out.println(0);
		else if ((c - a1) * n0 >= a0)
			System.out.println(1);
		else
			System.out.println(0);
	}
}