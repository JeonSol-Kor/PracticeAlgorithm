import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            int num = Integer.parseInt(br.readLine().trim());
            if (num == -1) break;
            sum += num;
        }
        br.close();
        System.out.println(sum);
    }
}