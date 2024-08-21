import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int n = Integer.parseInt(br.readLine().trim());
        int q1 = 0, q2 = 0, q3 = 0, q4 = 0, AXIS = 0;

        for (int i = 0; i < n; i++){
            String[] input = br.readLine().trim().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            if (x * y == 0) {
                AXIS++;
            }else if(x > 0 && y > 0) {
                q1++;
            }else if(x < 0 && y > 0) {
                q2++;
            }else if(x < 0 && y < 0) {
                q3++;
            }else if(x > 0 && y < 0) {
                q4++;
            }
        }

		bw.write("Q1: " + String.valueOf(q1) + '\n');
		bw.write("Q2: " + String.valueOf(q2) + '\n');
		bw.write("Q3: " + String.valueOf(q3) + '\n');
		bw.write("Q4: " + String.valueOf(q4) + '\n');
		bw.write("AXIS: " + String.valueOf(AXIS) + '\n');
		bw.flush();
		bw.close();
		br.close();
	}
}