import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(br.readLine().trim());
        List<int[]> condos = new ArrayList<>();

        for(int i = 0; i < N; i++){
            String[] input = br.readLine().trim().split(" ");
            int D = Integer.parseInt(input[0]);
            int C = Integer.parseInt(input[1]);
            condos.add(new int[]{D, C});
        }

        condos.sort((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });

        int cost = 10001;
        int result = 0;
        
        for (int[] i : condos) {
            int temp = i[1];
            if (temp < cost) {
                cost = temp;
                result++;
            }
        }
        
        bw.write(result + "\n");

		bw.flush();
		bw.close();
		br.close();
	}
}