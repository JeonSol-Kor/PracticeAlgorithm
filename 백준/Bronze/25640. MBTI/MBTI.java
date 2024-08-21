import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        String jinho = br.readLine().trim();
        int N = Integer.parseInt(br.readLine().trim());
        int result = 0;

        for(int i = 0; i < N; i++){
            String mbti = br.readLine().trim();
            if(mbti.equals(jinho)) result++;
        }

		bw.write(String.valueOf(result) + '\n');
		bw.flush();
		bw.close();
		br.close();
	}
}