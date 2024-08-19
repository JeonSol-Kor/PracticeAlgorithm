import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().trim().split(" ");
		int K = Integer.parseInt(line[0]);
		int N = Integer.parseInt(line[1]);
		long[] cables = new long[K];
		long high = 0;
		long low = 1;
		long result = 0;
		long mid = 0;
		
		for(int i = 0; i < K; i++){
            cables[i] = Long.parseLong(br.readLine().trim());
			if (high < cables[i]) high = cables[i];
		}
		
		while(low <= high){
            long count = 0;
			mid = (low + high) / 2;
			for(long cable : cables){
                count += cable / mid;
            }

			if(count >= N){
				result = mid;
                low = mid + 1;
			}else{
				high = mid - 1;
			}
		}
		
		bw.write(String.valueOf(result) + '\n');
		bw.flush();
		bw.close();
		br.close();
	}
}