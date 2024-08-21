import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(br.readLine().trim());
        int result = 0;
        for(int i = 0; i < N; i++){
            String[] input = br.readLine().trim().split(" ");
            int check = Integer.parseInt(input[0]);
            switch (check) {
                case 136:
                    result += 1000;
                    break;
                case 142:
                    result += 5000;
                    break;
                case 148:
                    result += 10000;
                    break;
                case 154:
                    result += 50000;
                    break;
            }
        }

		bw.write(String.valueOf(result) + '\n');
		bw.flush();
		bw.close();
		br.close();
	}
}