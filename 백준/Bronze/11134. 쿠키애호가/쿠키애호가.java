import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < T; i++){
            String[] line = br.readLine().split(" ");
            long N = Long.parseLong(line[0]);
            long C = Long.parseLong(line[1]);
            long result = N % C == 0 ? N / C : N / C + 1;
            answer.append(result).append('\n');
        }
        br.close();
        System.out.print(answer);
    }
}