import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int a = 1;
            int b = 0;
            int temp;
            for (int j = 0; j < N; j++) {
                temp = a;
                a = b;
                b += temp;
            }
            System.out.println(a + " " + b);
        }
        br.close();
    }
}