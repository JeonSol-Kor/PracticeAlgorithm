import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        HashMap<String, String> addrPw = new HashMap<>();
        for (int i = 0; i < N; i++) {
            line = br.readLine().split(" ");
            addrPw.put(line[0], line[1]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String request = br.readLine().trim();
            sb.append(addrPw.get(request) + "\n");
        }
        br.close();
        System.out.println(sb.toString());
    }
}