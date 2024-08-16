import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().trim().split(" ");
        
        double A = Long.parseLong(input[0]);
        long B = Long.parseLong(input[1]);
        double result = (2 + ((A - 2) * B)) * ((double)(B + 1) / 2);

        bw.write(String.valueOf((long)(result)));
        bw.flush();
        br.close();
        bw.close();
    }
}