import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String result = "Good";
        String[] input = br.readLine().trim().split(" ");
        int temp = -1000001;

        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            if (num >= temp) {
                temp = num;
            } else {
                result = "Bad";
                break;
            }
        }

        bw.write(result);
        bw.flush();
        br.close();
        bw.close();
    }
}