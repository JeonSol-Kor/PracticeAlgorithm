import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());

        int answer = 0;
        if (A < 0) {
            answer = -1 * A * C + D + B * E;
        } else {
            answer = (B - A) * E;
        }
        System.out.println(answer);
    }
}