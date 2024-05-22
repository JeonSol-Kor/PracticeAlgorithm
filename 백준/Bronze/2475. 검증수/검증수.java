import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		int numberSum = 0;
		for (int i = 0; i < 5; i++) {
			numbers[i] = sc.nextInt();
			numberSum += numbers[i] * numbers[i];
		}
		System.out.println(numberSum % 10);
		sc.close();
	}
}