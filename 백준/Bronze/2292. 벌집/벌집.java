import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int sequence = 1;
		int door = 1;
		while (N > sequence) {
			sequence += 6 * door;
			door++;
		}
		System.out.println(door);
	}
}