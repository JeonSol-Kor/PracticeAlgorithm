import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int time = sc.nextInt();
		sc.close();
		int timeH = 0;
		int timeM = 0;

		if (time > 59) {
			timeH = (int) (time / 60);
			timeM = time % 60;
		} else {
			timeM = time;
		}

		int outputH = timeH + H;
		int outputM = timeM + M;

		if (outputM > 59) {
			outputH = outputH + 1;
			outputM = outputM - 60;
		}

		if (outputH > 23) {
			outputH = outputH - 24;
		}

		System.out.println(outputH + " " + outputM);
	}
}