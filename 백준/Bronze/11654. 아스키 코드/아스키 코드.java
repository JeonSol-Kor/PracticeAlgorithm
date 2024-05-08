import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		char ch = sc.next().charAt(0);

		int asciiValue = (int) ch;

		System.out.println(asciiValue);

		sc.close();
	}
}