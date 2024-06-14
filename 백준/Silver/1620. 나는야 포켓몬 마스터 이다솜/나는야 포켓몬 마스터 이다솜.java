import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        HashMap<String, String> pocketmons = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String pocketmon = br.readLine().trim();
            pocketmons.put(pocketmon, String.valueOf(i));
            pocketmons.put(String.valueOf(i), pocketmon);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String question = br.readLine().trim();
            if (Character.isDigit(question.charAt(0))) {
                sb.append(pocketmons.get(question)).append("\n");
            } else {
                sb.append(pocketmons.get(question)).append("\n");
            }
        }

        br.close();
        System.out.print(sb);
    }
}