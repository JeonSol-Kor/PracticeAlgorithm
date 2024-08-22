import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[][] nums = new int[8][2];

        for(int i = 0; i < 8; i++){
            nums[i][0] = Integer.parseInt(br.readLine().trim());
            nums[i][1] = i + 1;
        }
        Arrays.sort(nums, (a, b) -> Integer.compare(b[0], a[0]));

        int sum = 0;
        int[] topIdx = new int[5];

        for(int i = 0; i < 5; i++){
            sum += nums[i][0];
            topIdx[i] = nums[i][1];
        }
        Arrays.sort(topIdx);
        
        bw.write(String.valueOf(sum) + "\n");
        for(int i : topIdx){
            bw.write(String.valueOf(i) + " ");
        }

		bw.flush();
		bw.close();
		br.close();
	}
}