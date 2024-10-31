import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int[][] ground = new int[N][M];

		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine().trim());
			for (int m = 0; m < M; m++) {
				ground[n][m] = Integer.parseInt(st.nextToken());
			}
		}

		int time;
		int target = 0;
		int answerTime = 2000000000;

		for(int i = 0; i <= 256; i++){
			time = 0;
			int tempB = B;
			for (int n = 0; n < N; n++) {
				for (int m = 0; m < M; m++) {
					if(i == ground[n][m]) continue;
					else if(i < ground[n][m]){
						int gap = ground[n][m] - i;
						tempB += gap;
						time += 2 * gap;
					}else{
						int gap = i - ground[n][m];
						tempB -= gap;
						time += gap;
					}
				}
			}
			if(time <= answerTime && tempB >= 0){
				target = i;
				answerTime = time;
			}
		}

		System.out.println(answerTime + " " + target);
		br.close();
	}
}