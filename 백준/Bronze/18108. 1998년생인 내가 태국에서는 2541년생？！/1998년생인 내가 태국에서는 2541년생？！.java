import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Bulgi = sc.nextInt();
		sc.close();
		int year = Bulgi - 543;
		System.out.println(year);
	}
}