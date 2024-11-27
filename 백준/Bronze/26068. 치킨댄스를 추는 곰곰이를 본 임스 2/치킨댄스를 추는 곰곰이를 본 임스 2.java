import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split("-");
            if(Integer.parseInt(input[1]) <= 90) answer++;
        }
        System.out.println(answer);
    }
}