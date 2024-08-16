import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().trim().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        char c  = input[2].charAt(input[2].length()-1);

        int result = c % 2 == 0 ? A : A ^ B;

        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
        bw.close();
    }
}