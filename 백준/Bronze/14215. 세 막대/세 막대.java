import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[] sides = new int[3];
		sides[0] = sc.nextInt();
		sides[1] = sc.nextInt();
		sides[2] = sc.nextInt();
		sc.close();

		Arrays.sort(sides);
		if (sides[2] < sides[0] + sides[1])
			System.out.println(sides[0] + sides[1] + sides[2]);
		else
			System.out.println(2 * (sides[0] + sides[1]) - 1);
	}
}