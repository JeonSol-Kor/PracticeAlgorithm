import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int C = sc.nextInt();
			int Quarter = C / 25;
			int Dime = (C % 25) / 10;
			int Nickel = ((C % 25) % 10) / 5;
			int Penny = (((C % 25) % 10) % 5);
			System.out.println(Quarter + " " + Dime + " " + Nickel + " " + Penny);
		}
		sc.close();
	}
}