import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String score = sc.next();
		sc.close();
		if (score.equals("F")) {
			System.out.println("0.0");
		} else {
			float output = 69 - (int) score.charAt(0);
			if (score.charAt(1) == '+')
				output += 0.3;
			else if (score.charAt(1) == '-')
				output -= 0.3;
			System.out.println(output);
		}
	}
}