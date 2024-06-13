import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int p = Integer.parseInt(line[0]);
            int t = Integer.parseInt(line[1]);
            int die = t / 7;
            int birth = t / 4;
            System.out.println(p - die + birth);
        }
    }
}